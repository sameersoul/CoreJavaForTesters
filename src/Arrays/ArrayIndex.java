package Arrays;

public class ArrayIndex {
	public static int index(int[] arr,int target) {
		
		for (int i = 0; i < arr.length; i++) {
			 if(target==arr[i]) {
				 return i;
			 }
			 
		}
		return -1;// Element not found
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr= {1,2,3,4};
           int target=3;
           System.out.println("index of number"+" "+target+" "+"is:"+" "+index(arr,target));
	}

}
