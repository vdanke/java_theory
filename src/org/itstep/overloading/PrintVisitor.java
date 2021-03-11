package org.itstep.overloading;

import org.itstep.overloading.obj.First;
import org.itstep.overloading.obj.Second;
import org.itstep.overloading.obj.Third;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(First first) {
        System.out.println("First");
    }

    @Override
    public void visit(Second second) {
        System.out.println("Second");
    }

    @Override
    public void visit(Third third) {
        System.out.println("Third");
    }
}
