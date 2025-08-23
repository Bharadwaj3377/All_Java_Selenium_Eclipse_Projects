package Practice;

class messages implements Runnable{
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
class greets implements Runnable{
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


public class Assign_3 {

	public static void main(String[] args) {
		Runnable r=new messages();
		Runnable s=new greets();
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(s);
		
		t1.start();
		t2.start();
		
	}

}
