package MovieTicketBooking;

import java.util.LinkedList;
import java.util.Scanner;

public class ticket {
	static Scanner sc=new Scanner(System.in);
	static LinkedList<String> A=new LinkedList<String>();
	static LinkedList<String> B=new LinkedList<String>();
	static LinkedList<String> C=new LinkedList<String>();
	static LinkedList<String> D=new LinkedList<String>();
	static LinkedList<String> E=new LinkedList<String>();
	
	ticket(String name){
		this.username=name;
		for(int i=0;i<10;i++){
			A.add(i,(i+1)+"-Empty");
		}
		for(int i=0;i<10;i++){
			B.add(i,(i+1)+"-Empty");
		}
		for(int i=0;i<10;i++){
			C.add(i,(i+1)+"-Empty");
		}
		for(int i=0;i<10;i++){
			D.add(i,(i+1)+"-Empty");
		}
		for(int i=0;i<10;i++){
			E.add(i,(i+1)+"-Empty");
		}
	}
	
	static String username;
	static String moviename;
	static double movierate;
	static String moviedate;
	static String movietime;
	static char row;
	static int seatnum;
	static int count;
	static LinkedList<String> seats=new LinkedList<String>();
	static void ticketbook(){
		System.out.println("Enter your choice:");
		System.out.println("\t1.Book ticket");
		System.out.println("\t2.view status");
		System.out.println("\t3.Exit");
		int n=sc.nextInt();
		if(n==3){System.out.println("...Exited...");}
		switch(n){
			case 1:
				movie();
				break;
			case 2:
				status();
				break;
		}
	}
	static void status() {
		System.out.println("Name        :  "+username);
		System.out.println("Movie Name  :  "+moviename);
		System.out.println("Movie Date  :  "+moviedate);
		System.out.println("Movie Time  :  "+movietime);
		System.out.println("Ticket Booked at "+seats);
		System.out.println("A"+A);
		System.out.println("B"+B);
		System.out.println("C"+C);
		System.out.println("D"+D);
		System.out.println("E"+E);
		ticketbook();
	}
	static void movie(){
		sc=new Scanner(System.in);
		System.out.println("Enter your movie choice:\n\t1.Rocketry - Rs.150");
		System.out.println("\t2.The Legend - Rs.165");
		System.out.println("\t3.Ponniyin Selvan: I - Rs.180");
		System.out.println("\t4.Gray man - Rs.145");
		int n=sc.nextInt();
		switch(n){
			case 1:
				moviename="Rocketry";
				movierate=150;
				date();
				break;
			case 2:
				moviename="The Legend";
				movierate=165;
				date();
				break;
			case 3:
				moviename="Ponniyin Selvan: I";
				movierate=180;
				date();
				break;
			case 4:
				moviename="Gray man";
				movierate=145;
				date();
				break;
			default:
				System.out.println("...Wrong Number you Entered, Choose again...\n");
				movie();
		}
	}
	static void date() {
		sc=new Scanner(System.in);
		System.out.println("Enter the Date in the format dd/mm/yyy :");	
		moviedate=sc.nextLine();
		time();
	}
	static void time() {
		sc=new Scanner(System.in);
		System.out.println("The Movie timings are:\n\t1. 11:00 AM\n\t2. 01:00 PM\n\t3. 06:00 PM\n\t4. 10:00 PM");
		int n=sc.nextInt();
		switch(n){
			case 1:
				movietime="11:00 AM";
				seatings();
				break;
			case 2:
				movietime="01:00 PM";
				seatings();
				break;
			case 3:
				movietime="06:00 PM";
				seatings();
				break;
			case 4:
				movietime="10:00 PM";
				seatings();
				break;
			default:
				System.out.println("...Enter correct timing...\n");
				time();
		}
	}
	static void seatings() {
		
		System.out.println("A"+A);
		System.out.println("B"+B);
		System.out.println("C"+C);
		System.out.println("D"+D);
		System.out.println("E"+E);
		System.out.println("How many ticket want to book");
		count=sc.nextInt();
		for(int i=1;i<=count;i++){
			System.out.println("\nEnter the row :");
			row=sc.next().charAt(0);
			row=Character.toUpperCase(row);
			System.out.println("Enter the seat number between (1-10) :");
			seatnum=sc.nextInt();
			switch(row){
				case 'A':
					A.remove(seatnum-1);
					A.add(seatnum-1,seatnum+"-"+username);
					seats.add("A_"+seatnum);
					break;
				case 'B':
					B.remove(seatnum-1);
					B.add(seatnum-1,seatnum+"-"+username);
					seats.add("B_"+seatnum);
					break;
				case 'C':
					C.remove(seatnum-1);
					C.add(seatnum-1,seatnum+"-"+username);
					seats.add("C_"+seatnum);
					break;
				case 'D':
					D.remove(seatnum-1);
					D.add(seatnum-1,seatnum+"-"+username);
					seats.add("D_"+seatnum);
					break;
				case 'E':
					E.remove(seatnum-1);
					E.add(seatnum-1,seatnum+"-"+username);
					seats.add("E_"+seatnum);
					break;
			}
		}
		rate();
	}
	static void rate() {
		System.out.println("Total Rate is "+movierate*count);
		System.out.println("Enter your choice:\n\t1.Make Payment\n\t2.Exit Payment");
		int n=sc.nextInt();
		switch(n){
			case 1:
				System.out.println("Ticket booked");
				ticketbook();
				break;
			case 2:
				System.out.println("Exited Payment");
				break;
		}
	}
}