package org.itstep.operatorscycles;

public class OperatorsCycles {

    public void operations(boolean isValid) {
        final String some = "abc";

        if (isValid) {

        } else if(!isValid) {

        } else {

        }

        switch (some) {
            case "abc":
                System.out.println(some);
                break;
            case "bca":
                System.out.println("Not some");
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void cycles() {
        int i = 5;
        int j = 7;
        Integer[] ints = new Integer[10];

        while (i < 10) {
            i++;
        }

        do {
            j++;
        } while (j < 10);


        for (int p = 0; p < i; p++) {
            if (p % 2 == 0) {
                continue;
            }
        }

        for (Integer z : ints) {
            if (z == 4) {
                break;
            }
        }

        for (int t = 0; t < 15; t++) {
            Outer:
            for (int g = t; g < 25; g++) {
                break Outer;
            }
        }
    }
}
