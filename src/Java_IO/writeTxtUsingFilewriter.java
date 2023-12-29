package Java_IO;

import java.io.FileWriter;
import java.io.IOException;

public class writeTxtUsingFilewriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example_output.txt");
        String text = "Hello, this is written to a file using FileWriter.";
        writer.write(text);
        writer.close();
    }
}

