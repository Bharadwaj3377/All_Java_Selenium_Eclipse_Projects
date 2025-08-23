package Practice;

class MyRun implements Runnable{
	public void run()
	{
		System.out.println("current thread name: "+Thread.currentThread().getName()); ;
	}
}

public class Assign_2 {

	public static void main(String[] args) {
		MyRun t1=new MyRun();
		
		Thread t=new Thread(t1);
		t.start();
		
	}

}
