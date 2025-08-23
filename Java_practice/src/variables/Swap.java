package variables;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		System.out.println("Enter another number : ");
		int b=sc.nextInt();
		System.out.println("Before swapping : "+a+"  "+b);

		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : "+a+"  "+b);

	}

}
