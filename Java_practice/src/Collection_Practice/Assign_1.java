package Collection_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search : ");
		int a=sc.nextInt();
		System.out.println(list);
		System.out.println(list.contains(a));

	}

}
