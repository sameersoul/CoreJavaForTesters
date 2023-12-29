package Java_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritetxtUsingBufferdOutputstream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./folder/scripts.txt"));
        String text = "Hello, this is written to a file using BufferedOutputStream.";
        byte[] bytes = text.getBytes();
        bos.write(bytes);
        bos.close();
    }
}
