package MovieTicketBooking;

import java.util.Scanner;

public class Main extends ticket {
	Main(String name) {
		super(name);
	}
	static Scanner sc=new Scanner(System.in);
	static String password="123";
	static String name;
	public static void main(String[] args) {
		System.out.println("\n**************************************************************\n");
		System.out.println("\t WELCOME TO THE MOVIE TICKET BOOKING\n");
		System.out.println("\t\t Developed by ARULKUMARAN T\n");
		System.out.println("**************************************************************\n");
		login();
		

	}
	static void login(){
		System.out.println("Enter your \n\t1.User login\n\t2.Admin");
		int n=sc.nextInt();
		if(n==1){
			user();
		}
		else if(n==2){
			PasswordChange();
		}
		else{
			System.out.println("Enter wrong number");
		}
	}
	static void PasswordChange() {
		System.out.println("Do you want to change the password, press(y or n)...");
		char ch=sc.next().charAt(0);
		if(ch!='y'){
			System.out.println("...Exited...");
			login();
		}
		System.out.println("Enter new password : ");
		password=new Scanner(System.in).nextLine();
		System.out.println("Your password is updated");
		login();
		
	}
	static void user(){
		System.out.println("Enter User name : ");
		sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter password : ");
		String enterpassword=sc.nextLine();
		if(enterpassword.equals(password)){
			new ticket(name).ticketbook();
		}
		else{
			System.out.println("Wrong Password, Try again");
			user();
		}
	}


}
