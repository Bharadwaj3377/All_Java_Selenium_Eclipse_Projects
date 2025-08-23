package Collection_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;

public class Assign_4 {

	public static void main(String[] args) {
		ArrayList<Character> list=new ArrayList<>();
		list.add('E');
		list.add('B');
		list.add('T');
		list.add('Z');
		list.add('Q');
		Collections.reverse(list);
		System.out.println(list);
	
	}

}
