package Collections;
import java.util.*;
public class Collections_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         LinkedList l1 =new LinkedList();
         l1.add(2);
         l1.add("I love u");
         l1.add(8);
         l1.add(1);
         System.out.println("Before Peak");
         System.out.println(l1);
         System.out.println("After peek");
         System.out.println(l1.peek());	
         System.out.println("After poll");
         l1.poll();
         System.out.println(l1);
         // sort is used to arrange the list elements in ascending order
         Collections.sort(l1);
         System.out.println(l1);
         }

}
