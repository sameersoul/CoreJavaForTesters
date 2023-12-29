package Loops;
import java.util.Scanner;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
      System.out.println("enter a positive number");   
      Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
    	  if(a%i==0) {
    		  count++;
    	  }
    	 }
      if(count==2) {
    	  System.out.println(a+" "+"is a prime number");
      }
      else {
    	  System.out.println(a+" "+"is not a prime number ");
      }
      

}}
