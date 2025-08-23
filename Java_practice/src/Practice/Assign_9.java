package Practice;


class Ga implements Runnable{
	Boolean running=false;
	static int ret=0;
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(running==true)
			{
				ret=1;
				break;
			}
				
		}
	}
	
}

public class Assign_9 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=new Ga();
		
		Thread t=new Thread(r);
		t.start();
		t.join();
		
		if(Ga.ret==1)
		{
			System.out.println("Thread stopped");
		}
		else
		{
			System.out.println("working");
		}

	}
	
	

}
