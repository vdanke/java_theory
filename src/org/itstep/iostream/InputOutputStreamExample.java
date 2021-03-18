package org.itstep.iostream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutputStreamExample {

    public static void main(String[] args) throws IOException {
//        mainMethods("file.txt");
//        byteArrayExample();
//        fileInputOutputStreamExample("file.txt");
//        pipedInputOutputStream();
        String data = workingTryWithResources("file.txt");
        System.out.println(data);
    }

    public static String workingTryWithResources(String filename) throws IOException {
        try (
                InputStream io = new FileInputStream(filename);
                BufferedInputStream bf = new BufferedInputStream(io)
        ) {
            int available = bf.available();
            byte[] bytes = new byte[available];
            int counter = 0;
            int i;
            while ((i = bf.read()) != -1) {
                bytes[counter] = (byte) i;
                counter++;
            }
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public static void pipedInputOutputStream() throws IOException {
        PipedInputStream is = new PipedInputStream();
        PipedOutputStream os = new PipedOutputStream(is);

        for (int i = 0; i < 20; i++) {
            os.write(i);
        }
        int available = is.available();
        byte[] toRead = new byte[available];

        int amountOfBytes = is.read(toRead, 0, available);
        System.out.printf("Amount of bytes was read: %d%n", amountOfBytes);
        for (Byte b : toRead) {
            System.out.printf("Byte %d read%n", b);
        }
        is.close();
        os.close();
    }

    public static void fileInputOutputStreamExample(String filename) throws IOException {
        byte[] toWrite = new byte[]{1, 2, 3};
        byte[] toRead = new byte[10];
        FileInputStream fis;
        FileOutputStream fos;

        fos = new FileOutputStream(filename);
        System.out.println("File was opened for write");
        fos.write(toWrite);
        System.out.printf("Amount of bytes %d was written to file%n", toWrite.length);
        fos.close();

        fis = new FileInputStream(filename);
        System.out.println("File was opened to read");
        int available = fis.available();
        System.out.printf("Available: %d%n", available);
        int readAmountOfBites = fis.read(toRead, 0, available);
        System.out.printf("Amount of bytes %d was read%n", readAmountOfBites);
        fis.close();

        for (Byte b : toRead) {
            System.out.printf("Read %d byte%n", b);
        }
    }

    public static void byteArrayExample() throws IOException {
        byte[] bytes = new byte[]{1, 0, -1};
        ByteArrayInputStream io = new ByteArrayInputStream(bytes);
        int f = io.read();
        System.out.printf("First byte was read: %d%n", f);
        int s = io.read();
        System.out.printf("Second byte was read: %d%n", s);
        int t = io.read();
        System.out.printf("Third byte was read: %d%n", t);
        io.close();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        os.write(10);
        os.write(11);
        os.write(-1);
        byte[] osBytes = os.toByteArray();
        for (Byte b : osBytes) {
            System.out.printf("Byte was read: %d%n", b);
        }
        os.close();
    }

    public static void mainMethods(String filename) throws IOException {
        File file = new File(filename);
        InputStream io = new FileInputStream(file);
        int available = io.available();
        byte[] buffer = new byte[available];
        int read = io.read(buffer);
//        int counter = 0;
//        int i;
//        while ((i = io.read()) != -1) {
//            buffer[counter] = (byte) i;
//            counter++;
//        }
        String str = new String(buffer, StandardCharsets.UTF_8);
        System.out.println(str);
        io.close();
    }
}
