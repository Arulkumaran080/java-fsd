package method;

public class MethodOverloading {

	public int calculate(int a,int b)
	{
		return a+b;
	}
	public int calculate(int a)
	{
		int c = (22/7)*(a*a);
		return c;
	}
	public int calculate(float a,float b)
	{
		int x=(int)a;
		int y=(int)b;
		int c = x*y;
		return c;
	}
	public int calculate(long x)
	{
		int a=(int)x;
		return a*a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ab=new MethodOverloading();
		int a=ab.calculate(5,5);
		int b=ab.calculate(5);
		int c=ab.calculate(5f,7f);
		int d=ab.calculate(8L);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
