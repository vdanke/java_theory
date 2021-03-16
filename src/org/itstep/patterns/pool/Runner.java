package org.itstep.patterns.pool;

public class Runner {

    public static void main(String[] args) {
        Pool pool = Pool.getInstance();

        Pool second = Pool.getInstance();

        Connection poll = pool.poll();

        poll.connect();

        poll.disconnect();

        pool.offer(poll);
    }
}
