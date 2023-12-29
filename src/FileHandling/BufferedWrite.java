package FileHandling;
import java.io.*;
import java.io.IOException;
import java.io.BufferedWriter;	
public class BufferedWrite{
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File f =new File("C:\\\\Users\\\\DELL\\\\3D Objects\\\\scripts.txt");
	FileWriter fw =new FileWriter(f);
	BufferedWriter bw =new BufferedWriter(fw);
	bw.write("I will be who I will be");
	bw.newLine();
	bw.write("Who iam iam");
	bw.newLine();
	bw.write("Holy spirit");
	System.out.println("data is written");
	bw.flush();
	

	}

}
