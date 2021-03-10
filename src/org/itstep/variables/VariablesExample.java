package org.itstep.variables;

public class VariablesExample {

    /*
    defaults:
    numbers - 0
    char - null
    boolean - false
     */

    // -128 - 127
    byte b;
    // -256 - 255
    short s;
    // -2147483648 - 2147483647
    int i;
    // -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
    long l;

    float f;
    double d;

    char c;
    boolean bool;

    public void writeVariables() {
        long bigNumber = 1_000_000_000L;
        double _someDouble = 1.1;
        int some = 04;
        float f = 1.1f;
    }
}
