package Multi_Threading;


public class Mythread extends Thread {
	void alphabet() throws InterruptedException
	{
		for(char ch='A'; ch<='z';ch++)
		{
			System.out.println(ch+" ");
			Thread.sleep(50);
		}
	}
	void numbers() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1);
		}
	}

	public static void main(String[] args) {
		Mythread my=new Mythread();
		my.alphabet();
		System.out.println();
		Mythread my1=new Mythread();
		my1.numbers();
		

	}

}
