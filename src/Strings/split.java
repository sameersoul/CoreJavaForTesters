package Strings;
public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a sample sentence";
		String[] words = sentence.split(" ");
		System.out.println("Split words:");
		for (String word : words) {
		    System.out.print(word+" ");
		}

	}

}
