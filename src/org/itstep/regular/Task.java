package org.itstep.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {

    public static void main(String[] args) {
        String s = filterText("sadkwjd!@#!@$sdmkaASDS333Adjkdn");
        System.out.println(s);
    }

    public static String filterText(String text) {
        // ! * ( /
        // определить спец символы [!, @, #, $, %]
        // List (Set!!!)
        Pattern p = Pattern.compile("[^a-zA-Z_0-9]");
        Matcher m = p.matcher(text);
        // фильтр строки
        String str = m.replaceAll("");
        // возврат строки без спец символов
        return str;
    }
}
