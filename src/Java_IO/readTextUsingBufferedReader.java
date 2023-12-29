package Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readTextUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./folder/scripts.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
