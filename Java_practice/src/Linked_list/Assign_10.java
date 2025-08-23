package Linked_list;


import java.util.LinkedList;

public class Assign_10 {

	public static void main(String[] args) {
		LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        originalList.add(50);

        // Clone the LinkedList
        @SuppressWarnings("unchecked")
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        // Display both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List:   " + clonedList);

	}

}
