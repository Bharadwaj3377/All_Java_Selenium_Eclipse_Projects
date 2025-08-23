package Practice;

class member extends Thread{
	 public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			
		}
	}
	}
}

public class Assign_1 {

	public static void main(String[] args) {
		member t1=new member();
		t1.start();
		
	}

}
