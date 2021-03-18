package org.itstep.exceptions;

public class RuntimeExceptionExample extends RuntimeException {

    // super обязательно
    public RuntimeExceptionExample() {
        super();
    }

    public RuntimeExceptionExample(String message) {
        super(message);
    }

    public RuntimeExceptionExample(String message, Throwable cause) {
        super(message, cause);
    }
}
