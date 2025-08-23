package polymorphism_basic;


public class Calculator {
	void add(int a,int b)
	{
		System.out.println(a+b);
   }
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(3, 4);
		cal.add(5, 6);
		cal.add(10, 23, 3);
		

	}

}
