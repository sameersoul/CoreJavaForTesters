package Java_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingInputstream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("./folder/scripts.txt")) {
            String text = "Hello :), this is written to a file using OutputStream.";
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

