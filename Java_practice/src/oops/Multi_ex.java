package oops;

class Vehicle
{
	void type(String ty)
	{
		System.out.println("It is a vehicle"+ty);
	}
}
class Four_wheeler extends Vehicle
{
	void wheels(int wh)
	{
		System.out.println("Four wheeler : "+wh);
	}

}
class petrol_Four_wheeler extends Four_wheeler
{
	void engine_type(String en)
	{
		System.out.println("Petrol Engine :"+en);
	}
}
class FiveSeater_petrol_Four_wheeler extends petrol_Four_wheeler
{
	void seater(int se)
	{
		System.out.println("5 seater : "+se);
	}
}
class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_petrol_Four_wheeler
{
	void model(String mod)
	{
		System.out.println("Baleno 2022 : "+mod);
	}
	
}
public class Multi_ex {

	public static void main(String[] args) {
		Baleno_FiveSeater_Petrol_Four_Wheeler c=new Baleno_FiveSeater_Petrol_Four_Wheeler();
		c.type("Vechile");
		c.wheels(5);
		c.engine_type("Petrol");
		c.seater(5);
		c.model("2022");

	}

}
