package Collections;
import java.util.*;
public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList l =new ArrayList();
           l.add(l);
           l.add("Allah");
           l.add('e');
           l.add(0.78);
           
           ListIterator itr =l.listIterator();
           while(itr.hasNext()) {
        	   Object obj =itr.next();
        	   System.out.println(obj);
           }
           while(itr.hasPrevious()) {
        	   Object obj =itr.previous();
        	System.out.println(obj);   
           }
	}

}
