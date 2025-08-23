package collecion_;

import java.util.List;
import java.util.LinkedList;

public class LinkL {
			public static void main(String[] args) {
				List<String> list=new LinkedList <>();
				list.add(0,"Apple");
				list.add(1,"Mango");
				list.add(2,"Kiwi");
				list.add(3,"Grapes");
				List<String> Clonedlist=new LinkedList <>(list);	
				
				System.out.println("Original List: " + list);
		        System.out.println("Cloned List: " + Clonedlist);

			}

		}



