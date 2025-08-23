package Array_practice;

public class Prime {

	public static void main(String[] args) {
		int[] arr=new int[] {10,4,8,3,9,7};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println(arr[i]);
				
			}
		}

	}
	static Boolean isPrime(int num) {
		if(num<=1) return false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0) {
			return false;
		}
	}
	return true;

}
}

