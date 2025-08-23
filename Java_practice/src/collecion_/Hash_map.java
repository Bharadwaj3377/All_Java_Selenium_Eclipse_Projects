package collecion_;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap <String, String>();
		map.put("one", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "water melon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "kiwi");
		map.put(null, "Nothing");
		map.put(null, "Orange");
		map.put("Nine", "Custardapple");
		
		System.out.println(map);
		map.replace("Nine", "Custardapple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		

	}

}
