package Arrays;

public class MinMaxDifference {
	public static int DiffMinMax(int[] arr) {
		int min = arr[0];
		int max =arr[0];
		
		for(int num:arr) {
			
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}return max-min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,6};
        int res=DiffMinMax(arr);
        		System.out.println("the difference between min and max is:"+" "+res);
	}

}
