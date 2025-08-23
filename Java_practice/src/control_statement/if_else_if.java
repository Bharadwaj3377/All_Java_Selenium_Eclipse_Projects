package control_statement;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float per=55f;
		if(per>=75)
		{
			System.out.println("Dist");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("Pass class");
		}
		else if(per>=0 && per<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
