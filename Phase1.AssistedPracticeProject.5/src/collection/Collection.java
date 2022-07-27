package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>();
		str.add("abc");
		str.add("def");
		str.add("mnop");
		str.add("123");
		System.out.println("Array List");
		System.out.println(str);
		
		HashSet<String> S=new HashSet<String>(str);
		System.out.print("\nHash Set\n");
		System.out.println(S);
	}

}
