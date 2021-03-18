package org.itstep.collect;

import java.util.Iterator;

public enum SomeEnum {
    ROLE_USER, ROLE_ADMIN;

    SomeEnum() {
    }

    public static Iterator<SomeEnum> iterator() {
        return new EnumIterable();
    }

    public static class EnumIterable implements Iterator<SomeEnum> {

        private final SomeEnum[] enums = SomeEnum.values();
        private int counter;

        @Override
        public boolean hasNext() {
            return counter < enums.length;
        }

        @Override
        public SomeEnum next() {
            SomeEnum anEnum = enums[counter];
            counter++;
            return anEnum;
        }
    }
}
