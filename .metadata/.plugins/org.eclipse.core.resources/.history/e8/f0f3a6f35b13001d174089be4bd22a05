package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbcaacbacabbcabcaacbcc";
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" Starts at "+m.start()+" and ends in "+m.end());
		}
	}

}
