package org.itstep.anonymous;

public abstract class AbstractFirstClass {

    private Message message;

    public abstract Message createMessage();

    public void addDefaultState() {
        message = createMessage();

        message.setMsg("default state");
    }

    public void addConfigurableState(String msg) {
        message = createMessage();

        message.setMsg(msg);
    }

    public Message getMessage() {
        return message;
    }
}
