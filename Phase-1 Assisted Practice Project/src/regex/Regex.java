package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="+919876543210";
		Pattern p=Pattern.compile("^[+91]+[0-9]{10}");
		Matcher m=p.matcher(str);
		if(m.find()){
			System.out.println(str+" is valid number");
		}
		else{
			System.out.println(str+" is not valid number");
		}
		}

}
