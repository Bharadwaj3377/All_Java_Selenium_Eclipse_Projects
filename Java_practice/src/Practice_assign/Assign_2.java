package Practice_assign;

class Add
{
    int Addition(int a, int b)
    {
    	int c=a+b;
    	return c;
    }
	
}
public class Assign_2 {
	public static void main(String[] args) {
		Add a=new Add();
		int b= a.Addition(200,3);
		System.out.println("Sum is : "+b);
		
		
		

	}

}
