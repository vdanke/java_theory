package org.itstep.oop;

public class ConstantExample {

    public static void main(String[] args) {
        ConstantExample constantExample = new ConstantExample();

        StringBuilder ex = new StringBuilder("super");
        constantExample.changeMe(ex);

        System.out.println(ex.toString());
    }

    public void changeMe(StringBuilder str) {
        str.append("abc");
        moreChanges(str);
    }

    public void moreChanges(StringBuilder str) {
        str.append("MORE !!!");
    }
}
