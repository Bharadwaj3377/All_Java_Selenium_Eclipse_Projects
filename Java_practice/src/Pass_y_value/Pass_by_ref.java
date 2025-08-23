package Pass_y_value;

public class Pass_by_ref {

	public static void changePassword(String password)
	{
		password="NewPassword";
	}
	public static void main(String[] args) {
		String password="oldPassword";
		changePassword(password);
		System.out.println("Password method="+password);
		

	}

}
