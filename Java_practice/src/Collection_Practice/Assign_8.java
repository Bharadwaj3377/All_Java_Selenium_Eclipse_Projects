package Collection_Practice;

import java.util.Collections;
import java.util.ArrayList;


class student
{
	int id;
	String name;
	int marks;
	
	
	student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

public class Assign_8 {

	public static void main(String[] args) {
		ArrayList<student> list=new ArrayList<>();
		list.add(new student(101,"Bharadwaj",500));
		list.add(new student(102,"Mohinoor",570));
		list.add(new student(103,"Mohitha", 600));
		
		for(student s :list)
		{
			System.out.println(s.id+"\t"+s.name+"\t"+s.marks);
		}
		

	}

}
