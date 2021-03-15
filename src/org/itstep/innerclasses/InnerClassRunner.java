package org.itstep.innerclasses;

import java.time.LocalDateTime;

public class InnerClassRunner {

    public static void main(String[] args) {
        OuterClass.Memento memento = new OuterClass("", LocalDateTime.now())
                .new Memento("", LocalDateTime.now());

        int randomNumber = StaticOuterClass.StaticInnerClass.getRandomNumber();

        StaticOuterClass.StaticInnerClass inner = new StaticOuterClass.StaticInnerClass();
    }
}
