package Encapsulation;

public class Encapsulation_ex {
	
	public String username;
	private String password;
	public String getUsername(String name)
	{
		this.username=name;
		System.out.println()
	}
	public String getPassword(String pass)
	{
		this.password=pass;
		System.out.println(pass);
	}

	public static void main(String[] args) {
		Encapsulation_ex p=new Encapsulation_ex();
		p.getUsername("Bobby");
		p.getPassword("bob");
		

	}

}
