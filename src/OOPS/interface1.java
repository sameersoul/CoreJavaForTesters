package OOPS;

interface demo{
	void hello();
	void bye();
}

abstract class interface1 implements demo {
	public void hello() {
		System.out.println("hi how are u");
		//public void bye()
	}}
class interface2 extends interface1 {
	public void bye() {
		System.out.println("bye see you");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          interface2 i =new interface2();
          i.bye();
          i.hello();
	}

}
