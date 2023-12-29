package Arrays;
import java.util.Arrays;


public class RemoveElement {
	public static int[] ElementRemove(int[] arr, int target) {
		int index=FindIndex(arr,target);
		
		//if the element is found remove it
		if(index!=-1) {
			int[] newArr=new int[arr.length-1];
			//copy the elements before the target element
			System.arraycopy(arr, 0, newArr, 0, index);
			//copy the elements after the target element
			System.arraycopy(arr, index+1, newArr, index, newArr.length-index);
			
			return newArr;
		}
			else {
				//if the element is not found, return the original array
				return arr;
			}
		
	}

	public static int FindIndex(int[] arr,int target) {
		// TODO Auto-generated method stub
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]==target) {
        		  return i;
        	  }
          }
          return -1;//element not found
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int target =3;
		System.out.println("Array after removing"+" "+ target+": "+Arrays.toString(ElementRemove(arr, target)));
	}
}
