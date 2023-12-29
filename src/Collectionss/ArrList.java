package Collectionss;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L =new ArrayList();
		for(int i=0;i<6;i++) {
			L.add(i);
		}
		ListIterator itr=L.listIterator();
		while(itr.hasNext()) {
			Object obj =itr.next();	
			System.out.println(obj);
			}
		L.add("sam");
		L.add(0, "hi");
		L.remove("sam");
		L.remove(0);
		L.contains(1);
		L.get(0);
		L.size();
		L.contains(L.get(1));
		L.removeAll(L);
		System.out.println("Empty List:"+" "+L);
	}

}
