package Oops.Encapsulation;
class student{
	String str;
	student(String str){
		this.str=str;
	}
	String method(){
		return str;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ob=new student("Arul");
		student ob1=new student("Ram");
		String s=ob.method();
		System.out.println(s);
		String s1=ob1.method();
		System.out.println(s1);
	}

}
