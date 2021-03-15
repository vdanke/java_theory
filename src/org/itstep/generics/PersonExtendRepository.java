package org.itstep.generics;

import org.itstep.generics.entity.Person;

public interface PersonExtendRepository<T extends Person, Z> {

    T approveSubscription(T t, Z z);
}
