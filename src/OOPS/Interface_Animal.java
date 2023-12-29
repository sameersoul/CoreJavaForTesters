package OOPS;
interface Animal {
	void noise();
}
class cat1 implements Animal{
	public void noise() {
		System.out.println("meow meow");
	}
}
class dog1 implements Animal{
	public void noise() {
		System.out.println("bow wow");
	}
}
class snake1 implements Animal{
	public void noise() {
		System.out.println("hiss sss");
	}
}
public class Interface_Animal {
	static void ansim(Animal a) {
		a.noise();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           cat1 c =new cat1();
           dog1 d =new dog1();
           snake1 s=new snake1();
           Interface_Animal.ansim(c);
           Interface_Animal.ansim(d);
           Interface_Animal.ansim(s);
	}

}
