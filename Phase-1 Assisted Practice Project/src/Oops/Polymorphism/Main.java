package Oops.Polymorphism;

class shape {
	int a,b;
	void area(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class square extends shape{
	void area(int a,int b){
		System.out.println("area of square "+a*b);
	}
}
class rectangle extends shape{
	public void area(int le,int be){
		System.out.println("area of rectangle "+le*be);
	}
}
class triangle extends shape{
	public void area(int bs,int he){
		System.out.println("area of triangle "+0.5*bs*he);
	}
}
class rhombus extends shape{
	public void area(int d1,int d2){
		System.out.println("area of rhombus "+d1*d2*0.5);
	}
}
public class Main {
	public static void main(String[] args) {
		shape s;
		s=new square();
		s.area(5,5);
		s=new rectangle();
		s.area(7,8);
		s=new triangle();
		s.area(4,8);
		s=new rhombus();
		s.area(9,6);
	}
}
