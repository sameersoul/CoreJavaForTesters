package Collections;
import java.util.PriorityQueue;
public class PriortyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             PriorityQueue p =new PriorityQueue();
            p.add(1);
            p.add(2);
            p.add(3);
            p.add(4);
            System.out.println("before peek:"+" "+p);
            System.out.println("after peek"+" "+p.peek());
            p.poll();
            System.out.println("after poll");
            System.out.println(p);
             
             
	}

}
