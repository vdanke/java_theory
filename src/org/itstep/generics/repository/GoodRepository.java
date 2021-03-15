package org.itstep.generics.repository;

import org.itstep.generics.CRUDRepository;
import org.itstep.generics.entity.Good;

public class GoodRepository implements CRUDRepository<Good> {

    @Override
    public Good[] findAll() {
        return new Good[0];
    }

    @Override
    public boolean save(Good good) {
        return false;
    }

    @Override
    public boolean update(Good good) {
        return false;
    }

    @Override
    public boolean delete(Good good) {
        return false;
    }
}
