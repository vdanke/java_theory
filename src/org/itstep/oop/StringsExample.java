package org.itstep.oop;

public class StringsExample {

    // Pull literals
    /*
    String abc = "abc";
    String bca = "abc;
    Pull literals is checking before each creation
     */
    public static void main(String[] args) {
        String abc = "abc";
        String bca = new String("abc");

        System.out.println(abc == bca);
        System.out.println(abc.equals(bca));
    }
}
