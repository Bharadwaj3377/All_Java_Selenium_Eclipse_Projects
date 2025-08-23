package This_keyword;

public class Test {
	void setName(String name)
	{
		System.out.println(name);
	}
	void getName()
	{
		this.setName("Mittal shah");
		System.out.println("Welcome to Java learning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.getName();

	}

}
