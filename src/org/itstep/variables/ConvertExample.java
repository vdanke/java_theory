package org.itstep.variables;

public class ConvertExample {

    public void convert() {
        int x = 200;
        long l = (long) x;

        long m = 200L;
        int y = (int) m;

        int first = 123456789;
        int second = 999999999;

        float firstF = first;
        float secondF = second;

        System.out.println(firstF);
        System.out.println(secondF);
    }

    public void convertTypes() {
        double a = 1.1;
        int b = 2;

        double v = b + a;
    }
}
