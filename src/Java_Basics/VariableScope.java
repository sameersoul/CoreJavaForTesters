package Java_Basics;

public class VariableScope {
	/**  this program demonstrate the use of local, 
	 *   instance and static variables 
	 */
	//instance variable is declared outside of the main method  or any block but inside class
            int  b=10;
            static String name ="sameer";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This variable 'a' is local to the main method only
		int a=20;
		System.out.println(a+" "+"is a local variable ");
		// create an object for the  class 'Variable Scope' to access the instance variable
		
		VariableScope Vs =new VariableScope();
		System.out.println("This is a instance variable"+" "+Vs.b);
		
		/*static variables should be declared using keyword 'static'
		 For accessing static variable just use class_name.variable_name
		 */
		System.out.println("this is static variable"+" "+name);
		
	}

}
