package org.itstep.patterns.methodfactory;

import org.itstep.patterns.factory.obj.Message;

public class Runner {

    public static void main(String[] args) {
        Message message = createMessage(new FirstMessageFactory());

        System.out.println(message.getDescription());
    }

    public static Message createMessage(FactoryMethod factoryMethod) {
        return factoryMethod.create();
    }
}
