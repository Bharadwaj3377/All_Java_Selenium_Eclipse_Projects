package Practice;



class message implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Good morning");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		}
	}
}
class greet implements Runnable{

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Welcome");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
	}
}

public class First_M {	
	public static void main(String[] args) {
		Runnable obj=new message();
		Runnable obj1=new greet();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();
			}

}
