package org.itstep.interfaces.comparator;

import org.itstep.interfaces.Person;
import org.itstep.interfaces.PersonData;

import java.util.Arrays;
import java.util.Comparator;

public class PersonComparatorSorting {

    /*
    Анонимный класс - будет существовать пока существует стек метода
     */
    public static void main(String[] args) {
        Person[] people = PersonData.fulfillData();

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getAge() - second.getAge();
            }
        };

        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getName().hashCode() - second.getName().hashCode();
            }
        };

        Arrays.sort(people, nameComparator);

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
