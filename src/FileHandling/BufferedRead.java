package FileHandling;
import java.io.*;
import java.io.IOException;
public class BufferedRead {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f =new File("C:\\\\Users\\\\DELL\\\\3D Objects\\\\scripts.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null){
			System.out.println(s);
			s=br.readLine(); 
		}
	}

}
