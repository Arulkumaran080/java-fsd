package constructor;

public class shape {

	int a,l,b;
	float f;
	double x;
	
	shape(){
		
	}
	shape(int r)
	{
		a=r;
		x=a*a;
	}
	shape(int m,int n)    //contructor overloading
	{
		l=m;
		b=n;
		x=l*b;
		//System.out.println(x);
	}
	shape(float d)
	{
		f=d;
		x=3.14*(f*f);
	}
	void area()
	{
		System.out.print("Area is " +x );
		System.out.print("\n");
	}
	
	void display(int a,int b)   //method overloading
	{
		x=(a*b)/2;
		System.out.println("Area of triangle "+x);
	}
	void display(float a,float b)
	{
		x=(a*b)/2;
		System.out.println("Area of rhombus "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape square=new shape(5);
		shape rectangle=new shape(7,8);
		shape circle=new shape(3f);
		square.area();
		rectangle.area();
		circle.area();
		new shape().display(6, 8);
		new shape().display(5f, 6f);
	}


}
