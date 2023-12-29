package Arrays;

public class FindElement {
	public static String ElementFinder(int target,int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==target) {
				return "element found";
			}
		}
		return "Element not found";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] array= {1,2,3,4,5};
          int target =100;
          System.out.println(ElementFinder(target, array));
	}

}
