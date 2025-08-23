package This_keyword;

public class Student {
	int rollno,age;
	String name,collegename,address;
	float per;
	void getdata(int rollno, String name, float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("Name="+name);
		System.out.println("Rollno="+rollno);
		System.out.println("Percentage="+per);
	}
	void details(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Name="+name);
		System.out.println("Rollno="+rollno);
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		s.details(101,"Bobby");
		s.getdata(105,"Chotu",89.9f);
		

	}

}
