package org.itstep.staticex;

import java.io.File;
import java.io.FileInputStream;

public class SingletonPattern {

    private static final SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        return INSTANCE;
    }
}
