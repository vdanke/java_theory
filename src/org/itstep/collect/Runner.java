package org.itstep.collect;

import java.util.Iterator;

public class Runner {

    public static void main(String[] args) {
        Iterator<SomeEnum> iterator = SomeEnum.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
