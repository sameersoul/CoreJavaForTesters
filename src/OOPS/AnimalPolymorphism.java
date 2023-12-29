package OOPS;

public class AnimalPolymorphism {
	void noise() {
		System.out.println("Animal noise");
	}}
class cat extends AnimalPolymorphism{
	void noise() {
		System.out.println("meow meow");
	}} 
 class dog extends AnimalPolymorphism{
	 void noise() {
		 System.out.println("bow wow");
	 }}
 class snake extends AnimalPolymorphism{
	 void noise() {
		 System.out.println("hiss ssss");
	 }}
 class simulator{
	 static void ansim(AnimalPolymorphism a) {
		 a.noise();
	 }}
 
class Mainclass{s
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cat c =new cat();
       dog d =new dog();
       snake s =new snake();
       simulator.ansim(c);
       simulator.ansim(d);
       simulator.ansim(s);
	}

	}
