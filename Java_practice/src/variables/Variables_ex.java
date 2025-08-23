package variables;

public class Variables_ex {

			int id;
			String employeeName;
			static String company="wipro";
			static float salary=32300f;
			String city;
			
			void details(int id1,String employeeName1,String city1)
			{
				id=id1;
				city=city1;
				employeeName=employeeName1;
			System.out.println("Id : "+id);
			System.out.println("EmployeeName : "+employeeName);
			System.out.println("Company : "+company);
			System.out.println("Salary : "+salary);
			System.out.println("City : "+city);
			}
			public static void main(String[] args) {
			Variables_ex v1=new Variables_ex();
			v1.details(101,"Bobby","Blr");
			Variables_ex v2=new Variables_ex();
			v2.details(102,"Mar","chennai");
			
		// TODO Auto-generated method stub

	}

}
