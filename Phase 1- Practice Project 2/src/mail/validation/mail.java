package mail.validation;

import java.util.*;
public class mail {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email to be find: ");
		String str = sc.next();
	  ArrayList<String> mail = new ArrayList<>();
      
      mail.add("arulkumaran@gmail.com");
      mail.add("kumar00@gmail.com");
      mail.add("keerthi@yahoo.com");
      mail.add("vikram@gmail.com");
      mail.add("bala@hotmailcom");
      mail.add("ramya@gmail.com.com");

	  //Load the list into a hashSet
	  HashSet<String> set = new HashSet<String>(mail);
	  if (set.contains(str))
	  {
	    System.out.println("Email is found ");
	  }
	  else
	  {
		  System.out.println("Email is not found, try with another id");
	  }
	}
}
