package org.itstep.generics;

public interface CRUDRepository<T> {

    T[] findAll();

    boolean save(T t);

    boolean update(T t);

    boolean delete(T t);
}
