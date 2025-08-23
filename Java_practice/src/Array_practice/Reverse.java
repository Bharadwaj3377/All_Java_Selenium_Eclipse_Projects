package Array_practice;

public class Reverse {

	public static void main(String[] args) {
		int[] arr1=new int[] {10,5,2,7,9,4};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[arr1.length-1-i];
		}

	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	}

}
