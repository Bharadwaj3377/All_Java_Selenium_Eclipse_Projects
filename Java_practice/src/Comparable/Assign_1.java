package Comparable;

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo,String name, int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Student other) {
		return this.rollNo-other.rollNo;
	}
	public String toString() {
		return "Roll No: "+rollNo +", Name: " +name+",Marks: "+marks;
	}
}
public class Assign_1 {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(102, "Ravi", 85));
        students.add(new Student(101, "Anita", 92));
        students.add(new Student(103, "Vikram", 78));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
		
	}

}
