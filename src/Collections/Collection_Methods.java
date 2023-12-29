package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class Collection_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ArrayList l =new ArrayList();
    l.add(3);
    l.add(4);
    l.add(1);
    l.add(6);
    l.add("Ouach");
    // get() is used to retrieve the value of the collection
    System.out.println(l.get(0));
    //contains() returns true if the value is found, if not false
    System.out.println(l.contains(3));
    //size() method is used to get the length of the collection
    System.out.println(l.size());
    //sort() is used to arrange the elements in ascending order
    Collections.sort(l);
    
	}

}
