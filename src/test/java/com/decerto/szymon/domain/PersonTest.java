package com.decerto.szymon.domain;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

class PersonTest {

    @Test
    void testSortingByPassportNumber() {
        List<Person> people = samplePeopleList();

        List<Person> sortedPeople = people.stream()
                .sorted(new Person.PersonPassportNumberComparator())
                .toList();

        assertEquals(List.of(
                new Person("PASS_NUM_A", "NAME_A", "SURNAME_A"),
                new Person("PASS_NUM_E", "NAME_E", "SURNAME_E"),
                new Person("PASS_NUM_Y", "NAME_Y", "SURNAME_Y")
        ), sortedPeople.subList(19, 22));
    }

    @NotNull
    private static List<Person> samplePeopleList() {
        return List.of(
                new Person("PASS_NUM_A", "NAME_A", "SURNAME_A"),
                new Person("NAME_C", "SURNAME_C"),
                new Person("NAME_D", "SURNAME_D"),
                new Person("NAME_B", "SURNAME_B"),
                new Person("NAME_F", "SURNAME_F"),
                new Person("NAME_N", "SURNAME_N"),
                new Person("NAME_A", "SURNAME_A"),
                new Person("PASS_NUM_E", "NAME_E", "SURNAME_E"),
                new Person("NAME_R", "SURNAME_R"),
                new Person("NAME_Q", "SURNAME_Q"),
                new Person("NAME_Z", "SURNAME_Z"),
                new Person("NAME_V", "SURNAME_V"),
                new Person("NAME_F", "SURNAME_F"),
                new Person("NAME_N", "SURNAME_N"),
                new Person("NAME_A", "SURNAME_A"),
                new Person("PASS_NUM_Y", "NAME_Y", "SURNAME_Y"),
                new Person("NAME_C", "SURNAME_C"),
                new Person("NAME_D", "SURNAME_D"),
                new Person("NAME_B", "SURNAME_B"),
                new Person("NAME_F", "SURNAME_F"),
                new Person("NAME_N", "SURNAME_N"),
                new Person("NAME_A", "SURNAME_A")
        );
    }
}
