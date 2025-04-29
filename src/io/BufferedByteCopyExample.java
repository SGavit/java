package io;

import java.io.*;

public class BufferedByteCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.png";       // Source binary file
        String destinationFile = "copy.png";    // Destination file
     try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile));
     ){
         byte[] buffer = new byte[1024];
         int bytesRead;

         while((bytesRead = bis.read(buffer)) != -1){
             bos.write(buffer, 0, bytesRead);
         }
    } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }
}
