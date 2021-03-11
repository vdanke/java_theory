package org.itstep.intfcs;

public class Runner {

    public static void main(String[] args) {
        Example example = new Calculate();

        Calculate calculate = new Calculate();

        boolean isInstance = calculate instanceof Example;

        example.square();
        calculate.some();
    }
}
