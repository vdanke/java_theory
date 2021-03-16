package org.itstep.bundle;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

public class BundleExample {

    public static void main(String[] args) {
        String[] allProperties = getAllProperties("config");
        for (String s : allProperties) {
            System.out.println(s);
        }
        // \u0012
        String hello = getValueDependsOnLocale("hello", Locale.getDefault());
        System.out.println(hello);
    }

    public static String getValueDependsOnLocale(String key, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("locale", locale);
        return bundle.getString(key);
    }

    public static String[] getAllProperties(String path) {
        ResourceBundle bundle = ResourceBundle.getBundle(path);
        Enumeration<String> keys = bundle.getKeys();
        Iterator<String> stringIterator = keys.asIterator();

        String[] arr = new String[3];
        int counter = 0;

        while(stringIterator.hasNext()) {
            String next = stringIterator.next();
            arr[counter] = next;
            counter++;
        }
        return arr;
    }
}
