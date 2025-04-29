package io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            // Create a PrintWriter that writes to a file called "example.txt"
            PrintWriter writer = new PrintWriter("example.txt");

            // Write some text using println and printf
            writer.println("Hello, PrintWriter!");
            writer.println("This is a second line.");
            writer.printf("Pi is approximately %.2f%n", Math.PI);

            // Don't forget to close the writer!
            writer.close();

            System.out.println("Text written to example.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
