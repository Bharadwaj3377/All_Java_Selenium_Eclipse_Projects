package Linked_list;

import java.util.LinkedList;

public class Assign_2 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(2);
		list.add(8);
		list.add(0);
		System.out.println(list);
		list.addFirst(5);
		list.addLast(89);
		//list.contains(2);
		System.out.println(list.contains(3));
		
		

	}

}
