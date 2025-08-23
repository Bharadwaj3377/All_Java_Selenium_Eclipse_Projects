package Practice;


class Ab implements Runnable{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
		System.out.println(i);
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException e)
		{
			
		}
		}
	}
	
	
}
public class Assign_4 {

	public static void main(String[] args) {
		Runnable r=new Ab();
		
		Thread t=new Thread(r);
		t.start();
	}

}
