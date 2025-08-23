package collecion_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List_creation {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
        Collections.sort(list);
        System.out.println(list);
	}

}
