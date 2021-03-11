package org.itstep.obj;

public class Runner {

    public static void main(String[] args) throws Exception {
        ObjectMethodExample o = new ObjectMethodExample("state");
        ObjectMethodExample o1 = o.clone();
        o1.setState("state");
        ObjectMethodExample o2 = o1.clone();
        System.out.println(o == o1);

        boolean equals = o.equals(o1);
        System.out.println(equals);
    }
}
