package Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class fileNotFoundException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("C:\\Users\\DELL\\3D Objects\\figma images\\Banner_image")); // This will generate FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}

