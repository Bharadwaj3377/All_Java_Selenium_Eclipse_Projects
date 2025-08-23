package Practice;

class Fa implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	}
}
class Fb implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Im Bharadwaj");
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	}
}


public class Assign_8 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=new Fa();
		Runnable s=new Fb();
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(s);
		
		
		System.out.println("Starting t1");
		t1.start();
		t1.join();
		System.out.println("t1 finished, starting t2");
		t2.start();
		t2.join();
		System.out.println("t2 finished");
		
	}

}
