package Arrays;

import java.util.Arrays;

public class Reverse {
	public static int[] revarr(int[] arr) {
		int[] rev=new int[arr.length];
		int index=0;
		for (int i = arr.length-1; i>=0;i--) {
			rev[index++]=arr[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5};
        int[] reversedarray=revarr(arr);
        System.out.println("Reversed array of {1,2,3,4,5}: "+Arrays.toString(reversedarray));
	}

}
