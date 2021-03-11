package org.itstep.intfcs;

public interface Example {

    double PI = 3.14;

    double square();

    interface BigExample extends Example {

        double BIG = Example.PI * 100;

        @Override
        double square();
    }

    interface SomeBigExample extends BigExample {

    }
}
