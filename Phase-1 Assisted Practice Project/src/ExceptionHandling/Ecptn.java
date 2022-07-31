package ExceptionHandling;


class MyException extends Exception{
	String s2;
	MyException(String s1){
		s2=s1;
	}
	public String toString(){
		return ("MyException Occurred : "+s2);
		
	}
}


public class Ecptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Starting of try block");
			throw new MyException("This is my Exception");
		}catch(MyException me){
			System.out.println("catch block");
			System.out.println(me);
		}
	}

}
