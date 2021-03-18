package org.itstep.exceptions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Runner {

    // try catch finally throw throws
    public static void main(String[] args) {
        try {
            stringIsValidWithException("asdasdasd");
        } catch (JuniorExceptionExample | IOException e) {
            if (e instanceof JuniorExceptionExample) {
                JuniorExceptionExample je = (JuniorExceptionExample) e;
                System.out.printf(
                        "Exception is happened. String is not valid, length: %d, difference: %d%n",
                        je.getInvalidLength(),
                        je.getDifference()
                );
            } else {
                System.out.println("File cannot be processed. Check the directory");
            }
        } catch (ExceptionExample e) {
            System.out.println(e.getLocalizedMessage() + " length: " + e.getInvalidLength());
        } finally {
            System.out.println("Finally block");
        }
//        } catch (IOException e) {
//            System.out.println("File is not accessible");
//        }
    }

    // extends Exception
    public static void stringIsValidWithException(String str) throws JuniorExceptionExample, ExceptionExample, IOException {
        int expectedSize = 5;
        int strLength = str.length();
        if (strLength < expectedSize) {
            throw new JuniorExceptionExample(
                    "The length is too small",
                    strLength,
                    expectedSize - strLength
            );
        }
        if (strLength > 10) {
            throw new ExceptionExample("Too big", strLength);
        }
        byte[] bytes = Files.readAllBytes(Paths.get(str));
        System.out.printf("File text: %s%n", new String(bytes, StandardCharsets.UTF_8));
    }

    // extends RuntimeException
    public static void stringIsValidWithRuntimeException(String str) {
        if (str.length() < 5) {
            throw new RuntimeExceptionExample("The length is too small");
        }
        System.out.printf("Good length: %d%n", str.length());
        throw new IllegalArgumentException();
    }
}
