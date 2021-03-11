package org.itstep.oop.solid.i;

import java.util.List;

public interface CRUDOperations {

    List<String> findAll();

    void update(String s);

    void save(String s);

    void delete(String s);
}
