package org.itstep.arr;

public class ArrayWork {

    public static void main(String[] args) {
        Second[] seconds = new Second[10];
        First[] firsts = seconds;

        firsts[0] = new First();
    }

    private static class First {

    }

    private static class Second extends First {

    }
}
