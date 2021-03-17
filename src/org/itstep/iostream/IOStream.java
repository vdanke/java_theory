package org.itstep.iostream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOStream {

    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";
        printInformationToConsole(fileName);
        systemOutStream();

        Reader reader = new FileReader(fileName);
        BufferedReader bReader = new BufferedReader(reader);
    }

    public static void systemOutStream() throws IOException {
        OutputStream str = System.out;
        str.write(104);
        str.write(101);
        str.write(58);
        str.close();
    }

    // IOException, FileNotFoundException, OutOfMemoryError
    public static void printInformationToConsole(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName, StandardCharsets.UTF_8);
        BufferedReader bf = new BufferedReader(fr);

        String s;

        while((s = bf.readLine()) != null) {
            System.out.println(s);
        }
        bf.close();
    }
}
