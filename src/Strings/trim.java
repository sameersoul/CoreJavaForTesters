package Strings;

public class trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   Trim Me   ";
		String trimmedStr = str.trim();
		System.out.println("Original: '" + str + "'");
		System.out.println("Trimmed: '" + trimmedStr + "'");
       // Replacing characters in a string using replace
		String original = "I like Java";
		String replaced = original.replace("Java", "Python");
		System.out.println("Original: " + original);
		System.out.println("Replaced: " + replaced);

	}

}
