package org.itstep.exceptions;

public class JuniorExceptionExample extends ExceptionExample {

    private final int difference;

    public JuniorExceptionExample(int invalidLength, int difference) {
        super(invalidLength);
        this.difference = difference;
    }

    public JuniorExceptionExample(String message, int invalidLength, int difference) {
        super(message, invalidLength);
        this.difference = difference;
    }

    public int getDifference() {
        return difference;
    }
}
