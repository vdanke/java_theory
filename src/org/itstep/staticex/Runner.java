package org.itstep.staticex;

import static java.lang.Math.*;

public class Runner {

    public static void main(String[] args) {
        Object o = new Object();

        StaticExample.printClassName();
        StaticExample.s = "new";
        StaticExample.printClassName();
        double pow = pow(2.0, 2.0);
        System.out.println(pow);

        SingletonPattern instance = SingletonPattern.getInstance();
        SingletonPattern instance1 = SingletonPattern.getInstance();
        System.out.println(instance == instance1);
        SingletonPattern instance2 = SingletonPattern.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance1 == instance2);
    }
}
