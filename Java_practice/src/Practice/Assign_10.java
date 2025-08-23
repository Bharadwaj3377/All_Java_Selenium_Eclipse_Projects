package Practice;


class Counter{
	static int count=0;
	public static synchronized void increment()
	{
		count++;
	}
	
}
class counterTask implements Runnable{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			Counter.increment();
		}
	}
	
}
public class Assign_10 {

	public static void main(String[] args) throws InterruptedException {
		
		counterTask c=new counterTask();
		counterTask d=new counterTask();
		
		
		Thread t1=new Thread(c);
		Thread t2=new Thread(d);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final counter value: "+Counter.count);
		
		

	}

}
