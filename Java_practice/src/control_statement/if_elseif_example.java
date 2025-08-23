package control_statement;

public class if_elseif_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float temp=5f;
		if(temp>=40)
		{
			System.out.println("Hot");
		}
		else if(temp>=30 && temp<40)
		{
			System.out.println("Warm");
		}
		else if(temp>=20 && temp<30)
		{
			System.out.println("Cool");
		}
		else if(temp<=10)
		{
			System.out.println("Very cool");
		}
		else
		{
			System.out.println("Invalid");
		*/
		
		/*int units=500;
		
		if(units<100)
		{
			System.out.println("Low usage");
		}
		else if(units>=100 && units<300)
		{
			System.out.println("Medium usage");
		}
		else if(units>=300 && units<500)
		{
			System.out.println("High usage");
		}
		else if(units>=500)
		{
			System.out.println("Very high usage");
		}
		else
		{
			System.out.println("Invalid");
		}
		*/
		
		String input="Green";
		if(input=="Red")
		{
			System.out.println("STOP");
		}
		else if(input=="Yellow")
		{
			System.out.println("Ready");
		}
		else if(input=="Green")
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Invalid colour");
		}

	}

}
