package collecion_;

import java.util.ArrayDeque;
public class ArrayDeque_demo {

	public static void main(String[] args) {
				ArrayDeque <String> q=new ArrayDeque <String>();
				q.add("Apple");
				q.add("Mango");
				q.add("Water melon");
				q.add("Kiwi");
				q.add("Mango");
				
				System.out.println(q);
				q.offer("Banana");
				System.out.println(q);
				//q.offerFirst("straw");
				q.poll();
				//q.peek();
                 q.remove();
				System.out.println(q);
			}

		}



