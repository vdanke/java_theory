package org.itstep.generics.repository;

import org.itstep.generics.CRUDRepository;
import org.itstep.generics.PersonExtendRepository;
import org.itstep.generics.entity.Person;
import org.itstep.generics.entity.Subscription;

public class PersonRepository implements CRUDRepository<Person>,
        PersonExtendRepository<Person, Subscription> {

    @Override
    public Person approveSubscription(Person person, Subscription subscription) {
        System.out.println("Approve");
        return person;
    }

    @Override
    public Person[] findAll() {
        return new Person[0];
    }

    @Override
    public boolean save(Person person) {
        return false;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(Person person) {
        return false;
    }
}
