package collecion_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		int search=5;
		int flag=0;

		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==search)
			{
				flag=1;
				break;
			}
			
			
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
