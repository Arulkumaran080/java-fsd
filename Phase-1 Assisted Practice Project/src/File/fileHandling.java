package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		char[] arr = new char[100];
		try{
			File file = new File("D://program//text.txt");
			if(file.createNewFile())
			{
				System.out.println("File is Created.");
			}else
			{
				System.out.println("File is already exists.");
			}
			FileWriter writer = new FileWriter(file);
			writer.write("This is the 1st file to create like this. \n");
			System.out.println("Enter the statement which you wants to append...");
			s=sc.nextLine();
			writer.append(s+"- This statement is updated");
			writer.close();
			FileReader in=new FileReader("D://program//text.txt");
			in.read(arr);
			System.out.println(arr);   
			if(file.delete()){  
				System.out.println(file.getName() + " deleted");     
			}  
			else{  
				System.out.println(file.getName() +" delete failed");  
			}  
		}catch (IOException e) {
            System.out.println("exception occurred " + e);
        }
	}

}
