package io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "img.png";
        String destinationFile = "copy.png";

        File outFile = new File(destinationFile);
        System.out.println("Full path of copied file: " + outFile.getAbsolutePath());

        try (
                FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(outFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("PNG file copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
