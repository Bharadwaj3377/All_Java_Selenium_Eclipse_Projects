package String_demo;

public class Vowels {

	public static void main(String[] args) {
		String input="Programming";
		char ch;
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			ch = Character.toLowerCase(input.charAt(i)); 
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
