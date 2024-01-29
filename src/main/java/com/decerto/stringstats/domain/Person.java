package com.decerto.stringstats.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

class Person {

    @Nullable
    String passportNumber;

    @NotNull
    String name;

    @NotNull
    String surname;

    Person(String passportNumber, String name, String surname) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.surname = surname;
    }

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return new EqualsBuilder()
                .append(passportNumber, person.passportNumber)
                .append(name, person.name)
                .append(surname, person.surname)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(passportNumber)
                .append(name)
                .append(surname)
                .toHashCode();
    }

    static final class PersonPassportNumberComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }
}
