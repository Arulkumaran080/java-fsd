package calc;
import java.util.Scanner;
public class calculater {
	double add(double a,double b){
		return a+b;
	}
	double sub(double a,double b){
		return a-b;
	}
	double mul(double a,double b){
		return a*b;
	}
	double div(double a,double b){
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculater ob=new calculater();
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value...");
		a=sc.nextDouble();
		System.out.println("Enter the second value...");
		b=sc.nextDouble();
		char c;
		System.out.println("Enter the operation + , - , * , /");
		c=sc.next().charAt(0);
		switch(c){
		case '+':
			System.out.println(a+" + "+b+" = "+ob.add(a,b));
			break;
		case '-':
			System.out.println(a+" - "+b+" = "+ob.sub(a,b));
			break;
		case '*':
			System.out.println(a+" * "+b+" = "+ob.mul(a, b));
			break;
		case '/':
			System.out.println(a+" / "+b+" = "+ob.div(a, b));
			break;
		default:
			System.out.println("Invalid character");
			break;
		}
	}

}
