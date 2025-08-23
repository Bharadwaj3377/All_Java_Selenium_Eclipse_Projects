package control_statement;

import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
			
		}*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full name : ");
		String Name=sc.nextLine();
		System.out.println("Enter mobile number : ");
		long Number=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email address : ");
        String Email=sc.nextLine();
        System.out.println("Enter username : ");
        String Username=sc.nextLine();
        System.out.println("Enter Password : ");
        String Password=sc.nextLine();
        System.out.println("Confirm password : ");
        String conpass=sc.nextLine();
        
        
        System.out.println("The Registerd User details : ");
        System.out.println("Name              : "+Name);
        System.out.println("Number            : "+Number);
        System.out.println("Email             : "+Email);
        System.out.println("Username          : "+Username);
        System.out.println("Password          : "+Password);
        System.out.println("confirm password  : "+conpass);
        
        if(Password.equals(conpass))
        {
        	System.out.println("Password is same");
        }
        else
        {
        	System.out.println("Password is not same");
        }
        */
		
		int year=1995;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("Leap year");
			
		}
		else
		{
			System.out.println("Not a leap year");
		}
        
        
      
        }
	}


