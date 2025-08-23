package Array_practice;

public class Max_min {

	public static void main(String[] args) {
		int[] arr=new int[] {10,3,0,6,80,20};
		int max=arr[0];
		int min=arr[0];
		int temp;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			else if(arr[i]<min)
			min=arr[i];
		}
		System.out.println("Minimum value of array : "+min);
		System.out.println("Maximum value of array : "+max);

	}

}
