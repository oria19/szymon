package com.decerto.duplicates.finder;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FinderTest {

    @Test
    void test1() {
        // Utwórz odpowiedni obiekt klasy Finder
        Set<Person> people = Set.of(
                new Person(1, "54757568678"),
                new Person(2, "11111111111"),
                new Person(3, "75869789678"),
                new Person(4, "11111111111"),
                new Person(5, "76586797457"),
                new Person(6, "22222222222"),
                new Person(7, "22222222222"),
                new Person(8, "11111111111")
        );
        // wywołaj metodę Finder::findDuplicates z odpowiednimi parametrami
        Map<String, List<Long>> duplicates = Map.of();
        assertTrue(duplicates.get("11111111111").containsAll(List.of(2L, 4L, 8L)));
        assertTrue(duplicates.get("22222222222").containsAll(List.of(6L, 7L)));
    }

    @Test
    void test2() {
        // Utwórz odpowiedni obiekt klasy Finder
        Set<Car> cars = Set.of(
                new Car("CAR1", "WA1111", "JN8AF5MR6FT501446"),
                new Car("CAR2", "WB1111", "1G1PC5SH5B7370353"),
                new Car("CAR3", "WC1111", "WBSDX9C54BE399700"),
                new Car("CAR4", "WD1111", "1FAHP27W18G122217"),
                new Car("CAR5", "WE1111", "4S2CK58W744390708"),
                new Car("CAR6", "WF1111", "3VWBK21C83M498308"),
                new Car("CAR7", "WG1111", "1GCEC140X7Z579839"),
                new Car("CAR8", "WD1111", "1N4AL2APXAN476835")
        );
        // wywołaj metodę Finder::findDuplicates z odpowiednimi parametrami
        Map<String, List<String>> duplicates = Map.of();
        assertTrue(duplicates.get("WD1111").containsAll(List.of("CAR4", "CAR8")));
    }

    private static final class Person {

        long id;
        String pesel;

        public Person(long id, String pesel) {
            this.id = id;
            this.pesel = pesel;
        }

        public long getId() {
            return id;
        }

        public String getPesel() {
            return pesel;
        }
    }

    private static final class Car {

        String resourceId;
        String registrationNumber;
        String vin;

        public Car(String resourceId, String registrationNumber, String vin) {
            this.resourceId = resourceId;
            this.registrationNumber = registrationNumber;
            this.vin = vin;
        }

        public String getResourceId() {
            return resourceId;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getVin() {
            return vin;
        }
    }
}
