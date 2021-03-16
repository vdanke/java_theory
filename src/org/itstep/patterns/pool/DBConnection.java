package org.itstep.patterns.pool;

public class DBConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("DB connect");
    }

    @Override
    public void disconnect() {
        System.out.println("DB disconnect");
    }
}
