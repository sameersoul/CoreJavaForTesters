package FileHandling;
import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f =new File("C:\\Users\\DELL\\3D Objects\\scripts.txt");
        if(f.createNewFile()) {
        	System.out.println("file is created");
        }
        FileWriter fw =new FileWriter(f);
        fw.write("i love nature");
        System.out.println("data is written");
        fw.flush();
	}

}
