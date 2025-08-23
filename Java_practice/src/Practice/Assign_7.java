package Practice;


class Ab implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread A");
		//t1.setPriority(Thread.MIN_PRIORITY);
		
	}
}
} 
class Ac implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread B");
		//t2.setPriority(Thread.NORM_PRIORITY);
	}
}
	
}
class Ad implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread C");
		//t3.setPriority(Thread.MAX_PRIORITY);
	}
}
}
public class Assign_7 {

	public static void main(String[] args) {
		Runnable p=new Ab();
		Runnable q=new Ac();
		Runnable r=new Ad();
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(q);
		Thread t3=new Thread(r);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
	}
		

	}


