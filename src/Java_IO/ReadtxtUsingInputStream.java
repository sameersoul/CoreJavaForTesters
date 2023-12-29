package Java_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadtxtUsingInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./folder/scripts.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
