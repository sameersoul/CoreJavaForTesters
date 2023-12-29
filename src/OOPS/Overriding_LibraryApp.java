package OOPS;

class Overriding_LibraryApp {
	void Books() {
		System.out.println("Read newly added books");
	}}
class LibraryApp extends Overriding_LibraryApp{
	
	void DigitalLibrary()  {
		System.out.println("Now u can access library through Digital library app");
		super.Books();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LibraryApp l1 =new LibraryApp();
          l1.DigitalLibrary();
	}

}
