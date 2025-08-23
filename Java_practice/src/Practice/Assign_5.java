package Practice;


class sms implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			Thread.yield();
	}
	}
}
class gun implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Im Bharadwaj");
	}
	}
}

public class Assign_5 {

	public static void main(String[] args) {
		Runnable r=new sms();
		Runnable s=new gun();
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(s);
		
		t1.start();
		t2.start();
		

	}

}
