package org.itstep.exceptions;

public class ExceptionExample extends Exception {

    private final int invalidLength;

    // super обязательно
    public ExceptionExample(int invalidLength) {
        super();
        this.invalidLength = invalidLength;
    }

    public ExceptionExample(String message, int invalidLength) {
        super(message);
        this.invalidLength = invalidLength;
    }

    public int getInvalidLength() {
        return invalidLength;
    }
}
