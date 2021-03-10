package org.itstep.numtostr;

public class ConvertNumString {

    public void convert() {
        String i = "123";
        String d = "123.2";

        Integer integer = Integer.getInteger(i);
        if (integer == null) {
            System.out.println("Not valid string");
        }
        int f = Integer.parseInt(i);
        double v = Double.parseDouble(d);

        String s = String.valueOf(f);
        String ab = "";
        ab += f;
        System.out.println(f);
        System.out.println(v);
        System.out.println(s);
        System.out.println(ab);
        String b = Integer.toBinaryString(123);
        String b1 = Integer.toBinaryString(512);
        System.out.println(Integer.parseInt(b) & Integer.parseInt(b1));
        System.out.println(Integer.toHexString(1919239128));
        System.out.println(Integer.toOctalString(123876213));
    }

    public static void main(String[] args) {
        ConvertNumString c = new ConvertNumString();

        c.convert();
    }
}
