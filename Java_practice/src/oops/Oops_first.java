package oops;

public class Oops_first {

		String name="Shradhha";
		void details(int rollno, String name, float per)//parametrrised
		{
			System.out.println("Rollno= "+rollno);
			System.out.println("Name= "+name);
			System.out.println("Percrntage= "+per);
		
	}
		double demo()//return method
		{
			return 89.9;
		}
		void test()//no argument method
		{
			
		}
      public static void main(String[] args)
      {
    	  Oops_first stud=new Oops_first();
    	  stud.details(101,"Moahn rag",89.9f);
    	  System.out.println("*****************");
    	  stud.details(102, "mittal", 87.0f);
    	  
    	
      }
}
