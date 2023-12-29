package Operators;

public class Arithmetic_Operators {
public static int addition(int a, int b) {
	return a+b;
}
public static int subraction(int a, int b) {
	return a-b;
}
public static double multiplication(int a, int b) {
	return a*b;
}
public static double division(double a, double b) {
	if(b!=0) {
		return b/a;
	}
	else {
		System.out.println("Error: Division by zero");
        return Double.NaN; // Not a Number
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		System.out.println("Addition: "+addition(num1, num2));
		System.out.println("subraction: "+subraction(num1, num2));
		System.out.println("multiplication: "+multiplication(num1, num2));
        System.out.println("division: "+division(num1, num2));
	}

}
