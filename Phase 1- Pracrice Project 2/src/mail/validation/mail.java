package mail.validation;
import java.util.regex.*;
import java.util.*;
public class mail {

	public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args)
    {
        ArrayList<String> mail = new ArrayList<>();
            
          mail.add("arul-^&kumaraan@gmail.com");
          mail.add("kumar00@gmail.com");
          mail.add("keerthi@yahoo.com");
          mail.add("@gmail.com");
          mail.add("abcd@hotmailcom");
          mail.add("xyz@abc.co.in");
            
        for(String i : mail){
            if (isValid(i))
                System.out.println(i + " - Valid");
            else
                System.out.println(i + " - Invalid");
        }
    }

}
