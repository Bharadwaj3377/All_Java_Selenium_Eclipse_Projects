package String_demo;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.substring(3, 7));
		System.out.println(sb.delete(3,7));
		System.out.println(sb.charAt(2));

	}

}
