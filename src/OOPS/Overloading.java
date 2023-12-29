package OOPS;

class Overloading {
	void Whatsapp(double a) {
		System.out.println("Whatsapp Version:"+" "+a);
	}
	void Whatsapp(String b) {
		System.out.println(b);
	}
	void Whatsapp(int c, String d) {
		System.out.println(c+" "+d);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Overloading w =new Overloading();
		w.Whatsapp(1.00);
		w.Whatsapp("Welcome to Whatsapp");
		w.Whatsapp(2,"Version is available");
		
	}}


