package Type_casting;




void display()
{
	System.out.println("Welcome");
}



void show()
{
	System.out.println("How are you?");
}
public class Test_demo {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		Test t=new Test1();
		t.show();
		Test 1 tt=(Test1)t;
		tt.display();
		tt.show();

	}

}
