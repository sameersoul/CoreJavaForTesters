package OOPS;
interface Deloitte{
	void getjob();
}
interface DeloitteUSA extends Deloitte{
	void gethike();
}
 class Naukri implements DeloitteUSA{
	 public void getjob() {
		 System.out.println("hey i got job in deloitte");
	 }
	 public void gethike() {
		 System.out.println("hey i got decent hike ");
	 }
 }

public class Interface_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Naukri n =new Naukri();
         n.getjob();
         n.gethike();
	}

}
