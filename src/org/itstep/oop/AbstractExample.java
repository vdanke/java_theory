package org.itstep.oop;

public abstract class AbstractExample {

    public String status;

    public AbstractExample(String status) {
        this.status = status;
    }

    public boolean validate() {
        String status = this.status;
        return status.length() > 5;
    }

    public void processMessage() {
        String msg = getMessage();

        System.out.println(msg + " " + status);
    }

    // String... arr == String[]
    // Only 1 argument like this, must be the last one
    public void exampleMultipleArguments(String str, String... arr) {
        String s = arr[0];
    }

    public abstract String getMessage();
}
