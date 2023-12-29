package Java_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeTxtUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("./folder/scripts.txt"));
        String text = "Hello, this is written to a file using BufferedWriter.\nSecond line.";
        writer.write(text);
        writer.close();
    }
}

