package org.itstep.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        numWork();
        splitWork();
    }

    public static void splitWork() {
        String[] ids = new String[2];
        String str = "/users/1/comments/2/description";
        String[] split = str.split("/");
        Pattern numbers = Pattern.compile("/*/[1-9]+");
        int counter = 0;
        for (String s : split) {
            if (numbers.matcher(s).matches()) {
                System.out.println(s);
                ids[counter] = s;
                counter++;
            }
        }
    }

    public static void numWork() {
        Pattern c = Pattern.compile("\\d+");
        Matcher m = c.matcher("12345");
        boolean isMatch = m.matches();
        System.out.println(isMatch);
    }

    public static void stringWork() {
        Pattern regex = Pattern.compile("[a-z]+");
        Matcher m = regex.matcher("aasads");
        boolean matches = m.matches();
        System.out.println(matches);
    }
}
