package String_demo;

public class Strings_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		}
		System.out.println("Vowel count : "+count);
	}

}
