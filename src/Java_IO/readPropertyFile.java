package Java_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        properties.load(fis);
        System.out.println("Property Value: " + properties.getProperty("example.property"));
        fis.close();
    }
}
