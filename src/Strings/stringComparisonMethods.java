package Strings;

public class stringComparisonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "HELLO";

		// Using equals()
		boolean isEqual = str1.equals(str2);
		System.out.println("Equals: " + isEqual);  // Output: false

		// Using equalsIgnoreCase()
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("EqualsIgnoreCase: " + isEqualIgnoreCase);  // Output: true

		// Using startsWith() and endsWith()
		boolean startsWith = str1.startsWith("he");
		boolean endsWith = str1.endsWith("lo");
		System.out.println("Starts with 'he': " + startsWith);  // Output: true
		System.out.println("Ends with 'lo': " + endsWith);  // Output: true

		// Using compareTo()
		int compareToResult = str1.compareTo(str2);
		System.out.println("CompareTo: " + compareToResult);  // Output: 32


	}

}
