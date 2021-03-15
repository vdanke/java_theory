package org.itstep.generics.wildcards;

public class Mark<T extends Number> {

    T mark;

    public Mark(T mark) {
        this.mark = mark;
    }

    public static <T extends Number> T createInstance(Class<T> cl) throws Exception {
        return cl.getConstructor().newInstance();
    }

    public boolean isEqualWithoutType(Mark<? extends Number> mark) {
        System.out.println(mark.getMark());
        System.out.println(this.getMark());
        return this.getMark().doubleValue() >= mark.getMark().doubleValue();
    }

    public boolean isEqual(Mark<T> mark) {
        System.out.println(mark.getMark());
        System.out.println(this.getMark());
        return this.getMark().equals(mark.getMark());
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }
}
