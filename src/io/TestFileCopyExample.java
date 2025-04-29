package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "src/io/input.txt";     // source text file
        String destinationFile = "src/io/output.txt"; // destination text file

        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(destinationFile)
        ) {
            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("Text file copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
