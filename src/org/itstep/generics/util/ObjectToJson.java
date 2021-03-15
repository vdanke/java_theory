package org.itstep.generics.util;

import org.itstep.generics.entity.Person;

public class ObjectToJson {

    public static <T> String convertToJson(T t) {
        System.out.println(t.getClass().getSimpleName());
        return t.toString();
    }

    public static <T extends Person> T convertToObject(String s, Class<T> tClass) throws Exception {
        return tClass.getConstructor().newInstance();
    }
}
