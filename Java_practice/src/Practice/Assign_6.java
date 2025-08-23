package Practice;

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}


public class Assign_6 {

	public static void main(String[] args) {
		Evenodd e=new Evenodd();
		
		Thread t1=new Thread(()->{
			try {
				e.even();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();				
			}
		}
		Thread t2=new Thread(()->{
			try {
				e.odd();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		t1.start();
		t2.start();
		
	}

}
