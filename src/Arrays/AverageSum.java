package Arrays;

public class AverageSum {
	public static int AvgArrSum(int[] arraySum) {
		int sum=0;int len=arraySum.length;
		for(int num:arraySum) {
			sum=sum+num;
		}
		return sum/len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {1,2,3,4,5};
		 System.out.println("Average of array is:"+" "+arr);
           
	}

}
