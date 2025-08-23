package control_statement;

import java.util.Scanner;

public class example {

	public static void main(String[] args)
	{
		int age=10;
		Boolean hasIdcard=true;
		if(age>=18 && hasIdcard)
		{
			System.out.println("Allowed for entry");
		}
		else
		{
			System.out.println("gets student discount");
		}
		
	}
}
