package Oops.Inheritance;
class Animals{
	void a(){
		System.out.println("Wild animal");
	}
}
class Dog extends Animals{
	void b(){
		System.out.println("Pet animal");
	}
}
class Puppy extends Dog{
	void c(){
		System.out.println("Little Dog");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy ob=new Puppy();
		ob.a();
		ob.b();
		ob.c();
	}

}
