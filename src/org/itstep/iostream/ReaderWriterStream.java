package org.itstep.iostream;

import java.io.*;

public class ReaderWriterStream {

    public static void main(String[] args) throws Exception {
//        charArrayReaderWriterExample();
        bufferedFileReaderWithPushback();
    }

    public static void bufferedFileReaderWithPushback() throws IOException {
        String s = "if (a == 4) a = 0;\n";
        char[] chars = s.toCharArray();
        CharArrayReader reader = new CharArrayReader(chars);
        PushbackReader f = new PushbackReader(reader);
        int c;
        while ((c = f.read()) != -1) {
            switch (c) {
                case '=' -> {
                    if ((c = f.read()) == '=') {
                        System.out.println("equal");
                    } else {
                        System.out.println("<-");
                        f.unread(c);
                    }
                }
                default -> System.out.println((char) c);
            }
        }
        f.close();
    }

    public static void fileWriterExample(String filename) throws IOException {
        Writer writer = new FileWriter(filename);

        writer.write("a");
        writer.write("b");
        writer.write("c");

        writer.close();
    }

    public static void charArrayReaderWriterExample() throws IOException {
        String str = "asdknwkdnakjwdnawbdkjawndamd";
        char[] symbols = str.toCharArray();
        CharArrayReader reader = new CharArrayReader(symbols);
        CharArrayReader readerWithOffset = new CharArrayReader(symbols, 0, 5);

        int i;

        System.out.println("First reader");
        while ((i = reader.read()) != -1) {
            System.out.println("Char was read " + (char) i);
        }
        System.out.println();
        System.out.println("Second reader");
        while ((i = readerWithOffset.read()) != -1) {
            System.out.println("Char was read " + (char) i);
        }
        reader.close();
        readerWithOffset.close();
    }
}
