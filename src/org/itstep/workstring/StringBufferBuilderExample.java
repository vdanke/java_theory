package org.itstep.workstring;

public class StringBufferBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("To concat");

        String str = toInsert("sadkqwjhdiunwzhquidqwyudgzbasdxabhwjkxh");

        System.out.println(str);
    }

    public static String toInsertBuffer(String longStr) {
        StringBuffer buffer = new StringBuffer(longStr);
        return buffer.toString();
    }

    public static String toInsert(String longStr) {
        char[] chars = longStr.toCharArray();
        StringBuilder builder = new StringBuilder(124);
        String temporary;
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                temporary = builder.toString();
                boolean isContains = temporary.contains(Character.toString(chars[i]));
                if (!isContains) {
                    builder.append(chars[i]);
                }
            }
        }
        builder.trimToSize();
//        int capacity = builder.capacity();
//        builder.ensureCapacity(124);
//        builder.setLength(2);
        return builder.toString();
    }
}
