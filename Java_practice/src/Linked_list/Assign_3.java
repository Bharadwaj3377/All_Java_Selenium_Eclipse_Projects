package Linked_list;

import java.util.LinkedList;

public class Assign_3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Mango");
		list.add("Grapes");
		list.add("orange");
		list.add("coco");
		
		System.out.println(list);
		list.set(2, "Bobby");
		System.out.println(list);
		
	}

}
