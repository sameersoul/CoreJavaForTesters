package Loops;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,copy=n,sum=0,rem;
		while(n!=0) {
		rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		}
		if(copy==sum) {
			System.out.println(copy+" "+"is a palindrome number");
		}
		else {
			System.out.println(copy+" "+"is not a palindrome number");
		}

	}

}
