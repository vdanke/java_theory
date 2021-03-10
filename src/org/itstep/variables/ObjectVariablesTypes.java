package org.itstep.variables;

public class ObjectVariablesTypes {

    {
        System.out.println("Initialized");
    }

    public ObjectVariablesTypes() {
        System.out.println("Constructor");
    }

    public void objectVariables() {
        // byte
        Byte b = 1;
        // short
        Short s = 123;
        // int
        Integer i = 1;
        int i1 = Integer.parseInt("123");
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        // long
        Long l = 1L;
        // float
        Float f;
        Double d;
        // boolean
        Boolean bool;
        // char
        Character ch;
    }
}
