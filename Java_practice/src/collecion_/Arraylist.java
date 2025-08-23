package collecion_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		        list.add("A");
		        list.add("B");
		        list.add("C");

		        String[] arr = list.toArray(new String[0]);

		        for (String s : arr) {
		  
		        }
		        System.out.println(Arrays.toString(arr));

		    }
		}




