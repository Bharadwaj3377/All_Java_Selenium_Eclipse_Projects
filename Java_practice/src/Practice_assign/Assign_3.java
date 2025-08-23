package Practice_assign;


class Swap
{
	void swapnos(int a,int b)
	{
		int temp=0;
		System.out.println("Before swapping : "+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : "+a+" "+b);
		}
	

}
public class Assign_3 {

	public static void main(String[] args) {
		Swap s= new Swap();
		s.swapnos(3,9);
		
	}

}
