package Thread;

class ThreadDemo extends Thread implements Runnable {
	
	public void run()
	{
		System.out.println("Thread demo \n");
	}
}

public class threads {

	public static void main(String[] args) {
		
		//Thread class
		ThreadDemo mt=new ThreadDemo();
		mt.start();
		
		//Runnable Interface
		ThreadDemo mt1=new ThreadDemo();
		Thread t=new Thread(mt1);
		t.start();

	}

}