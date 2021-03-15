package org.itstep.interfaces.comparable;

import org.itstep.interfaces.Person;
import org.itstep.interfaces.PersonData;

import java.util.Arrays;

public class PersonSorting {

    public static void main(String[] args) {
        Person[] people = PersonData.fulfillData();

        Arrays.sort(people);

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }

    private static void oldSchool(Person... people) {
        boolean isSorted = false;

        int i = 0;
        /*
        O(n)
         */
        while (!isSorted) {
            isSorted = true;
            if (i == people.length - 1) {
                i = 0;
            }
//            for (int i = 0; i < people.length - 1; i++) {
                if (people[i].getAge() > people[i + 1].getAge()) {
                    Person temporary = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temporary;
                    isSorted = false;
                }
//            }
            i++;
        }
    }
}
