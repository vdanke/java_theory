package org.itstep.anonymous;

import java.util.Comparator;

public class AnonymExample {

    public static void main(String[] args) {
        AbstractFirstClass realization = new AbstractFirstClass() {
            @Override
            public Message createMessage() {
                return new Message();
            }
        };
        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.getMsg().hashCode() - o2.getMsg().hashCode();
            }
        };
        realization.addDefaultState();
        Message message = realization.getMessage();
        realization.addConfigurableState("custom state");
        message = realization.getMessage();

        System.out.println(message.getMsg());
    }
}
