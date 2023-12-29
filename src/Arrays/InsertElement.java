package Arrays;

import java.util.Arrays;

public class InsertElement {
	public static int[] elementInsert(int[] arr, int position,int Element) {
		int[] newArr=new int[arr.length+1];
		//copy the elements before the specified position
		System.arraycopy(arr, 0, newArr, 0, position);
		//insert the new element
		newArr[position]=Element;
		//copy the elements after the specified position
		System.arraycopy(arr,position,newArr, position+1, arr.length-position);
		return newArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr= {1,2,4,5};
          int Element=3;
          int position=2;
          int[] newArr=elementInsert(arr, position, Element);
          System.out.println("Array after insertion:"+Arrays.toString(newArr));
	}

}
