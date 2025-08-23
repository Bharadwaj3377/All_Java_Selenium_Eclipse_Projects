
package control_statement;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		System.out.println("Enter the weight : ");
		int weight=sc.nextInt();
		if(age>=18 && weight>=30)
		{
			System.out.println("Eligible for blood donation");
		}
		else
		{
			System.out.println("No you are not eligible");
		}
	}

}
