package Collection_Practice;


import java.util.Collections;
import java.util.ArrayList;

public class Assign_9 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Water melon");
		list1.add("cheery");
		System.out.println(list1);
		
		list2.addAll(list1);
		System.out.println(list2);

	}

}
