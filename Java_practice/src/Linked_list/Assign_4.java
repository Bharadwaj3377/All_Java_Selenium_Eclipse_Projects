package Linked_list;


import java.util.LinkedList;
import java.util.ListIterator;

public class Assign_4 {

	public static void main(String[] args) {
		  LinkedList<String> cities = new LinkedList<>();
		  cities.add("Bombay");
		  cities.add("Mumbai");
		  cities.add("chennai");
		  cities.add("Bang");
		  
		  ListIterator<String> iterator=cities.listIterator();
		  
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  
		  while(iterator.hasPrevious()) {
			  System.out.println(iterator.previous());

	}

}
}
