package Map;

import java.util.*;

public class maps {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"hello");
		hm.put(2,"Hi");
		hm.put(3,"hey");
		hm.put(4,"Java");
		System.out.println("HashMap");
	      for(Map.Entry i:hm.entrySet()){    
		       System.out.println(i.getKey()+" "+i.getValue());    
		      }
	    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	    ht.put(4, "car");
	    ht.put(5, "bike");
	    ht.put(6, "cycle");
	    ht.put(7, "2-wheeler");
	    ht.put(8, "2-wheeler");
	    System.out.println();
	    System.out.println("HashTable");
	      for(Map.Entry s:ht.entrySet()){    
		       System.out.println(s.getKey()+" "+s.getValue());    
		      }


		
	}
}
