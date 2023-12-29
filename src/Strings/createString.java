package Strings;
// Using string literal
public class createString{
	public static void main (String[] args) {
String str1 = "Hello, World!";
System.out.println("creating string using direct declarartion and initialization: "+str1);

// Using new keyword and constructor
String str2 = new String("Hello, World!");
System.out.println("creating string using new operator:"+str2);

// Using char array
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(charArray);
String str5= " world";
// Using StringBuilder
StringBuilder stringBuilder = new StringBuilder("Hello");
stringBuilder.append(str5);
String str4 = stringBuilder.toString();
System.out.println("creating string using string builder:"+" "+str4);
}}