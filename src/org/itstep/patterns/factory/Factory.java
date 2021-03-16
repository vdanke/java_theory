package org.itstep.patterns.factory;

import org.itstep.patterns.factory.obj.FirstMessage;
import org.itstep.patterns.factory.obj.Message;
import org.itstep.patterns.factory.obj.SecondMessage;
import org.itstep.patterns.factory.obj.ThirdMessage;

public class Factory {

    public static Message createMessage(MessageEnum message) {
        switch (message) {
            case FIRST -> {
                return new FirstMessage();
            }
            case SECOND -> {
                return new SecondMessage();
            }
            case THIRD -> {
                return new ThirdMessage();
            }
            default -> throw new IllegalArgumentException("Enum is not valid");
        }
    }
}
