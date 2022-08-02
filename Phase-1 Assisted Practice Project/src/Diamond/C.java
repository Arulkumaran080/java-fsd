package Diamond;

interface A{  
	default void display(){  
		System.out.println("class A display() method called");  
	}  
}  

interface B{  
	default void display(){  
		System.out.println("class B display() method called");  
	}  
}  

public class C implements A,B {  
	public static void main(String args[]){  
		C d = new C();  
		d.display();   
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		A.super.display();
		B.super.display();
	}  
}  
