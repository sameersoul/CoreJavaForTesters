package Arrays;

import java.util.Arrays;

public class CopyArray {
	public static int[] ArrayCopy(int[] arr) {
		int[] newArray=Arrays.copyOf(arr,arr.length);
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,5};
		System.out.println("copied array:"+Arrays.toString(ArrayCopy(numbers)));

	}

}
