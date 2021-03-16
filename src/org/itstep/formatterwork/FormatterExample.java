package org.itstep.formatterwork;

import java.util.Formatter;

public class FormatterExample {

    public static void main(String[] args) {
//        Formatter formatter = new Formatter();
//        formatter.format();
//        String.format();
        System.out.printf("%.2f\n", 1.0000);
        System.out.printf("%d\n", 1);
        System.out.printf("%s\n", "str");
        System.out.printf("%h\n", "str");
        System.out.printf("%b\n", true);
    }
}
