package SynchronizationAndSleep;

import java.io.*;

class Road{
	synchronized public void getRoad(){
		for (int i = 0; i < 3; i++){
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e){
				System.out.println(e);
			}
		}
	}
}

class Bus extends Thread
{
	Road road;
	Bus(Road road){
		this.road = road;
	}

	@Override
	public void run()
	{
		road.getRoad();
	}
}

public class SynchronizationMethod{
	public static void main(String[] args){
		Road ob = new Road();

		Bus Bus1 = new Bus(ob);
		Bus Bus2 = new Bus(ob);
		
		Bus1.setName("Bus 1");
		Bus2.setName("Bus 2");

		Bus2.start();
		Bus1.start();
	}
}