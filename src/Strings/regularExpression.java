package Strings;

public class regularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "12345";
		boolean isMatch = text.matches("\\d+");
		System.out.println("Is it a number? " + isMatch);  // Output: true


	}

}
