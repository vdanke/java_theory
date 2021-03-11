package org.itstep.overloading;

import org.itstep.overloading.obj.First;
import org.itstep.overloading.obj.Second;
import org.itstep.overloading.obj.Third;

public interface Visitor {

    void visit(First first);

    void visit(Second second);

    void visit(Third third);
}
