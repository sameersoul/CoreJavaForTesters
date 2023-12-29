package Collections;
import java.util.*;
public class Collections_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet h = new HashSet();
      h.add("sam");
      h.add(786);
      h.add("adil");
      // Hashset ,linked hashset and Treeset doesn't allows duplicates
      h.add(786);
      // Hashset and linked hashset allows null
      h.add("");
      System.out.println(h);
      


}}
