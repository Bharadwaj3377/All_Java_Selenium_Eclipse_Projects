package Encapsulation;

class First{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public void getName(String name) 
	{
		System.out.println("Person Name="+name);
	}

	public static void main(String[] args) {
		First p=new First();
		p.getName("Bharadwaj");

	}

}
