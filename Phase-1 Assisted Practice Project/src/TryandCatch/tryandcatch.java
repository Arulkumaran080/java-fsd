package TryandCatch;

public class tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=0;
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.print("1"+e.getMessage());
//			e.printStackTrace();
		}
		catch(Exception e1){
			System.out.print("2"+e1.getMessage());
		}
		finally{
			c=a+b;
			System.out.println("\nIn the finally block "+c);
		}
	}

}