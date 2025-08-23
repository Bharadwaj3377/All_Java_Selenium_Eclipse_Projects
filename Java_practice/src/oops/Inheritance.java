package oops;

public class Inheritance {
	class test
	{
		void show()
		{
			System.out.println("Show method from test class");
		}
	}
	class TestData extends test
	{
		void display()
		{
			System.out.println("Testdata class method");
		}
	}
	

	public static void main(String[] args) {
		TestData td=new TestData();
		td.show();
		
		test t=new test();
		t.display();
	}

}
