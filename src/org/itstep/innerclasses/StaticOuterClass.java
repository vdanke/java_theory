package org.itstep.innerclasses;

import java.util.Random;

public class StaticOuterClass {

    private String state;
    private static String staticState = "abc";

    public StaticOuterClass(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static class StaticInnerClass {

        public StaticOuterClass createInstance() {
            return new StaticOuterClass(staticState);
        }

        public static int getRandomNumber() {
            return new Random().nextInt(100);
        }
    }
}
