package Loops;


public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=153,sum=0,rem;
         int copy=n;
         while(n!=0) {
        	 rem=n%10;
        	 sum=sum+(rem*rem*rem);
        	 n=n/10;
        }
         if(copy==sum) {
        	 System.out.println(copy+" "+"is an armstromg number");
         }
         else {
        	 System.out.println(copy+" "+"is not an armstrong number");
         }
	}

}
