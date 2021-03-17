package org.itstep.iostream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReadModern {

    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("file.txt"));
        List<String> linesList = Files.readAllLines(Paths.get("file.txt"));
        byte[] bytes = Files.readAllBytes(Paths.get("file.txt"));
        linesList.forEach(s -> System.out.println(s));
        Arrays.asList(bytes).forEach(b -> System.out.println(b));
        for (Byte b : bytes) {
            System.out.println(b);
        }
    }
}
