package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Zerobank_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Page load successfully");
		
		//locating username
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys(" ");
		
		//locating username text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(" ");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		{
			System.out.println("Manual test::-->Check user is unable to login with"+"invalid username and invalid password");
		}
		
		Thread.sleep(5000);
		
		
	//test case 2
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Page load successfully");
		
		//locating username
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("Bharadwaj");
		
		//locating username text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		{
			System.out.println("Manual test::-->Check user is unable to login with"+"invalid username and valid password");
		}
		
		Thread.sleep(5000);
		
		//testcase 3
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Page load successfully");
		
		//locating username
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating username text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("12345");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		{
			System.out.println("Manual test::-->Check user is unable to login with"+"valid username and invalid password");
		}
		
		Thread.sleep(5000);
		
		//testcase4
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Page load successfully");
		
		//locating username
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating username text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		{
			System.out.println("Manual test::-->Check user is unable to login with"+"valid username and valid password");
		}
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
