package This_keyword;

public class Test1 {
	Test1(String name)
	{
		System.out.println(name);
	}
	Test1()
	{
		this("Im from Test1 parametreized constructor");
		System.out.println("Welcome to my space");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();

	}

}
