package Loops;

public class largestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=20,c=30;
        if(a>b) {
        	if(a>c) {
        		System.out.println(a+" "+"is greater than"+" "+c);
        	}
        }
        else if (b>a) {
        		if(b>c) {
        			System.out.println(b+" "+"is greater than"+" "+c);
        	}
        		else if(c>a) {
        	        if(c>b) {
        	        	System.out.println(c+" "+"is greater than"+" "+a+" "+"and "+" "+b);
        	        }
        		}
        }
	}

}
