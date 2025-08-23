package Array_practice;

public class Two_dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{}{}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println((arr[i]+1)[j]+1);
				arr[i][j]++;
			}
			System.out.println();
		}

	}

}
