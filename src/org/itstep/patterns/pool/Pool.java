package org.itstep.patterns.pool;

import java.util.concurrent.ArrayBlockingQueue;

public class Pool {

    public ArrayBlockingQueue<Connection> connections = new ArrayBlockingQueue<>(5);

    private static final Pool INSTANCE = new Pool();

    private Pool() {
        System.out.println("Instance created");
        for (int i = 0; i < 5; i++) {
            this.connections.add(new DBConnection());
        }
    }

    public static Pool getInstance() {
        return INSTANCE;
    }

    public Connection poll() {
        System.out.println("Take connection");
        return this.connections.poll();
    }

    public void offer(Connection connection) {
        System.out.println("Put connection");
        this.connections.add(connection);
    }
}
