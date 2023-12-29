package Collections;
import java.util.ArrayList;
public class Collections_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l= new ArrayList();
		l.add("sam");
		l.add("suhail");
		l.add("adil");
		System.out.println("before Remove"+" "+l);
		l.remove(0);
		System.out.println("After Remove :"+" "+l);
		
		ArrayList l1 = new ArrayList();
		l1.add("hu");
		l1.add("bye");
		l1.addAll(l);
		System.out.println(l1);
		l1.removeAll(l);
		System.out.println(l1);

	}

}
