package Array_practice;

public class Copy {

	public static void main(String[] args) {
		 int[] arr1=new int[] {10,3,6,7,2};
		 int[] arr2=new int[arr1.length];
		 for(int i=0;i<arr1.length;i++)
		 {
			 arr2[i]=arr1[i];
		 }
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr2[i]);
		 }
	}

}
