package Practice_assign;

class Student
{
	String name;
	static int rollno=123;
	String sec;
	
	void section(String sec)
	{
		
		this.sec = sec;        // ✅ corrected assignment
        System.out.println("Section: " + sec);
	}
	

}
public class Assign_1 {
	

	public static void main(String[] args) {
		Student std = new Student();
		std.name="Bobby";
		System.out.println(std.name);
		System.out.println(std.rollno);
		std.section("A section");
		//System.out.println("Stored Section: " + std.sec);
		

	}

}
