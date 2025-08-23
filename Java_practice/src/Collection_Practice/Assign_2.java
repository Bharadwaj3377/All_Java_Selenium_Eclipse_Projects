package Collection_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_2 {

	public static void main(String[] args) {
	 ArrayList<String> list=new ArrayList<>();
	 list.add("Mango");
	 list.add("Apple");
	 list.add("cherry");
	 list.add("Guva");
	 list.add("Banana");
	 System.out.println(list);
	 list.remove("cherry");
	 System.out.println("Updated List : "+list);
	}

}
