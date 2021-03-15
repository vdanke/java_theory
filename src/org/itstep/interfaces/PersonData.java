package org.itstep.interfaces;

import java.util.Random;

public class PersonData {

    public static Person[] fulfillData() {
        final int size = 10;

        Random random = new Random();

        Person[] people = new Person[size];

        for (int i = 0; i < size; i++) {
            people[i] = new Person("Name " + i, random.nextInt(10) + 18);
        }
        return people;
    }
}
