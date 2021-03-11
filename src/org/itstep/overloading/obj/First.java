package org.itstep.overloading.obj;

import org.itstep.overloading.Visitor;

public class First implements Common {

    @Override
    public void common() {

    }

    @Override
    public void call(Visitor visitor) {
        visitor.visit(this);
    }
}
