package org.itstep.overloading.obj;

import org.itstep.overloading.Visitor;

public interface Common {

    void common();

    void call(Visitor visitor);
}
