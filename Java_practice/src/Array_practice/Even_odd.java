package Array_practice;

public class Even_odd {

	public static void main(String[] args) {
		int[] arr=new int[] {10,3,1,2,4,6,8};
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else if(arr[i]%2!=0)
			{
				count1++;
			}
		}
		System.out.println("Even count : "+count);
		System.out.println("Odd count : "+count1);

	}

}
