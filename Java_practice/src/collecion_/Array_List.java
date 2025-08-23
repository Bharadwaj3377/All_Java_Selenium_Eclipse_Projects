package collecion_;

import java.util.List;
import java.util.LinkedList;

public class Array_List {

					public static void main(String[] args) {
						List<String> list=new LinkedList <>();
						list.add(0,"Apple");
						list.add(1,"Mango");
						list.add(2,"Kiwi");
						list.add(3,"Grapes");
						//List<String> Clonedlist=new LinkedList <>(list);	
						
				        ArrayList<String> arrayList = new ArrayList<>(list);

				        System.out.println("ArrayList: " + arrayList);


					}

				}




	}

}
