package Lambda_functions;

interface Even
{
	boolean iseven(int num);
	
}
public class Evenoddlambda {

	public static void main(String[] args) {
		Even check=(num)->num%2==0;
		System.out.println(iseven(4));
		

	}

}
