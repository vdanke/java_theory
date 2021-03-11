package org.itstep.overloading;

import org.itstep.overloading.obj.Common;
import org.itstep.overloading.obj.First;
import org.itstep.overloading.obj.Second;
import org.itstep.overloading.obj.Third;

// Visitor design pattern
public class Runner {

    private String s;

    public Runner() {
    }

    public Runner(String s) {
        this.s = s;
    }

    public Runner(int i) {

    }

    public static void main(String[] args) {
        Runner r = new Runner();

        r.makeExecution(new PrintVisitor(), new Third());
    }

    public void makeExecution(Visitor visitor, Common common) {
        common.call(visitor);
    }

    public void setSome() {

    }

    public int setSome(int i) {
        return i;
    }

    public int setSome(String s) {
        return s.length();
    }

    public void setSome(String s, int i) {

    }
}
