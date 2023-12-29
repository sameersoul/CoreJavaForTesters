package Java_IO;

import java.io.FileReader;
import java.io.IOException;

public class readTextUsingFileReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./folder/scripts.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
    }
}
