package org.itstep.staticex;

// Static working only with static
public class StaticExample {

    public static String s = "first";

    // Called only once in app lifecycle when first method or variable will be called
    static {
        System.out.println("Static block");
        s = "Static block";
    }

    public static void printClassName() {
        String name = StaticExample.class.getSimpleName();
        System.out.println(name + " " + s);
    }
}
