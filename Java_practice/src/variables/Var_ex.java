package variables;

public class Var_ex {
	int employeeId;
	String employeeName;
	static String company="Wipro";
	
		void details(int employeeId1, String employeeName1)
		{
			employeeId=employeeId1;
			employeeName=employeeName1;
		}
		public static void main(String[] args) {
			Var_ex obj=new Var_ex();
			obj.details(101, "Bobby");
			System.out.println("EmployeeId : "+obj.employeeId);
			System.out.println("EmployeeName : "+obj.employeeName);
			System.out.println("Company : "+company);
				

	}

}
