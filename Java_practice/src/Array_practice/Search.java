package Array_practice;

public class Search {

	public static void main(String[] args) {
		int[] arr=new int[] {10,40,3,6,90};
		int key=100;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				
			}
			
		}
		if(flag==1)
		{
			System.out.println("Element found");
			
		}
		else
		{
			System.out.println("Element not found");
		}
		
		

	}

}
