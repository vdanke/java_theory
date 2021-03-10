package org.itstep.operations;

public class ExtraOperators {

    public void extra() {
        Integer f = 1;
        Integer s = 2;

        boolean isInstance = f instanceof Integer;
        boolean isInstanceS = s instanceof Integer;

        String res = s > f ? "Ura" : "Bad";
    }
}
