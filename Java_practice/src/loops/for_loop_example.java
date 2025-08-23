package loops;

public class for_loop_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stubif
		/*int a=2;
		int b=50;
		
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}*/
		
		int a=1;
		int b=10;
		for(int i=a;i<=10;i++)
		{
			System.out.println(i+" = "+i*i);
		}
		
		int n=50;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			//System.out.println("sum : "+sum);
			
		}
		System.out.println("sum of first 50 numbers is: "+sum);

		int n=17;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		/*
		for(int i=20;i>=1;i--)
		{
			System.out.println(i);
		}*/
		
		/*int fact=1;
		int n=7;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is : "+fact);
		*/
		
         /* int number=10;
          boolean isPrime=true;
          for(int i=2;i<=number/2;i++)
          {
        	  if(number%i==0)
        	  {
        		  isPrime=false;
        		  break;
        		  
        	  }
          }
          if(isPrime)
          {
        	  System.out.println(number + " is a prime number");
          }
          else
          {
        	  System.out.println(number + " is not a prime number"); 
          }*/
		  /* int num=6785;
		   int originalnum=num;
		   int sum=0;
		   int d;
		   while(num>0)
		   {
			   d=num%10;
			   sum=sum+d;
			   num=num/10;
		   }
           System.out.println("The sum of "+originalnum+" is : "+sum);
		*/
		/*int num=6732123;
		int originalnum=num;
		int d;
		int count=0;
		while(num>0)
		{
			d=num%10;
			num=num/10;
			count++;
		}
		System.out.println("The total number of digits in " +originalnum+ " : "+count);
		  */
		
          
	}

}
