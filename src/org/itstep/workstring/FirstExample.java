package org.itstep.workstring;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class FirstExample {

    public void read(String toRead) {
        byte[] bytes = toRead.getBytes(StandardCharsets.UTF_8);
        byte[] withoutCharset = toRead.getBytes();

        String s = new String(bytes);

        System.out.println(s);
    }

    public void equal(String toCompare) {
        String from = "abc";

        boolean equals = from.equals(toCompare);
        boolean b = from.equalsIgnoreCase(toCompare);
    }

    public void registr(String registr) {
        String s = registr.toUpperCase();
        String s1 = registr.toLowerCase();
        char[] chars = s.toCharArray();
    }

    public void concatination(String toConcat) {
        String from = "abc";
        from += toConcat;
        String concat = from.concat(toConcat);
    }

    public void searching(String toSearch) {
        int a = toSearch.indexOf("a");
        int a1 = toSearch.indexOf("a", 5);

        int a2 = toSearch.lastIndexOf("a");

        String replace = toSearch.replace('a', 'b');
        String replace1 = toSearch.replace("abc", "cba");
        String s = toSearch.replaceFirst("abc", "bca");
        String s1 = toSearch.replaceAll("a", "b");

        boolean abc = toSearch.contains("abc");

        String s2 = String.copyValueOf(replace.toCharArray(), 3, 5);

        boolean c = toSearch.endsWith("c");
        boolean a3 = toSearch.startsWith("a");
    }

    public void extract(String toExtract) {
        String trim = toExtract.trim(); // without spaces in start and end
        String substring = toExtract.substring(5);
        String substring1 = toExtract.substring(5, 7);
        CharSequence charSequence = toExtract.subSequence(5, 7);
    }

    public String format(String toInsert) {
        return String.format("This message inserted: %s", toInsert);
    }

    // /users/{id}/content/{content_value}
    public void split(String toSplit) {
        String[] split = toSplit.split("/");
        String s = split[3];
        System.out.println(s);
    }

    public static void main(String[] args) {
        FirstExample f = new FirstExample();
        f.read("some");
    }
}
