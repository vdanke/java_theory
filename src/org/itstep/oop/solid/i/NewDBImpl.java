package org.itstep.oop.solid.i;

import java.util.List;

public class NewDBImpl implements CRUDOperations, ExtraOperations{

    @Override
    public List<String> findAll() {
        return null;
    }

    @Override
    public void update(String s) {

    }

    @Override
    public void save(String s) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public String getById(String s) {
        return null;
    }

    @Override
    public String getByIdWithRole(String s, String role) {
        return null;
    }

    @Override
    public boolean checkIfExists(String s) {
        return false;
    }
}
