package variables;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  length : ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth : ");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("Area of Recatangle : "+area);

	}

}
