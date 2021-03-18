package org.itstep.collect.setcollect;

import org.itstep.collect.Person;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getIin().hashCode() - o2.getIin().hashCode();
            }
        };

        sortedSetMethods(comparator, populatePersons());
    }

    private static Person[] populatePersons() {
        Person[] arr = new Person[4];
        arr[0] = new Person("123456789012");
        arr[1] = new Person("234567890123");
        arr[2] = new Person("345678901234");
        arr[3] = new Person("123456789015");
        return arr;
    }

    public static void sortedSetMethods(Comparator<Person> comparator, Person... people) {
        HashSet<Person> personSet = new HashSet<>();

        SortedSet<Person> setPeople = new TreeSet<>(comparator);
        setPeople.addAll(Arrays.asList(people));

        SortedSet<Person> people1 = setPeople.headSet(people[0]);
        SortedSet<Person> people2 = setPeople.tailSet(people[1]);
        SortedSet<Person> people3 = setPeople.subSet(people[1], people[3]);
    }

    public static void navigableSetMethods(Comparator<Person> comparator, Person... people) {
        NavigableSet<Person> navigableSet = new TreeSet<>(comparator);

        NavigableSet<Person> f = navigableSet.headSet(people[0], true);
        NavigableSet<Person> s = navigableSet.tailSet(people[1], false);
        NavigableSet<Person> t = navigableSet.subSet(people[0], true, people[1], false);
        Person higher = navigableSet.higher(people[0]);
        Person lower = navigableSet.lower(people[0]);
        NavigableSet<Person> ff = navigableSet.descendingSet();
        Person person = navigableSet.pollFirst();
        Person person1 = navigableSet.pollLast();
    }
}
