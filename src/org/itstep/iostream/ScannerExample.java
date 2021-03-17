package org.itstep.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("file.txt");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("This is int! " + scanner.nextInt());
                continue;
            }
            if (scanner.hasNextDouble()) {
                System.out.println("This is double! " + scanner.nextDouble());
                continue;
            }
            System.out.println("This is string " + scanner.next());
        }
    }
}
