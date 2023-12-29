package Arrays;

public class ArraySum {
	public static int sumArray(int[] array) {
		int sum=0;
		for(int num:array) {
			sum=sum+num;
		}
		return sum;
	}
// Driver method to test sumArray function
	public static void main(String[] args) {
	int[] array= {1,2,3,4};
	System.out.println("the sum of array is:"+sumArray(array));

}}
