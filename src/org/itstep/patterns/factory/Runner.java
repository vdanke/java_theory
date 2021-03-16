package org.itstep.patterns.factory;

import org.itstep.patterns.factory.obj.Message;

public class Runner {

    public static void main(String[] args) {
        Message message = Factory.createMessage(MessageEnum.THIRD);

        System.out.println(message.getDescription());
    }
}
