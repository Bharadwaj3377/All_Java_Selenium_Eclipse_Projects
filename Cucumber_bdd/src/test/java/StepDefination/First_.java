/*
package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First_ {
	 WebDriver driver;
		
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    
	}
	
	@When("click on username button and enter valid username")
	public void click_on_username_button_and_enter_valid_username() throws InterruptedException {
		WebElement user=driver.findElement(By.id("user_login"));
		user.click();
		user.sendKeys("username");
		Thread.sleep(3000);
	}
	
	@And("add password")
	public void add_password() throws InterruptedException {
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.click();
		pass.sendKeys("password");
		Thread.sleep(3000);
		
	}
	@And("click on signin button")
	public void click_on_signin_button() throws InterruptedException {
		WebElement sign=driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\"])"));
		sign.click();
		Thread.sleep(3000);
	   
	}
	
	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		driver.close();
	    System.out.println("login successfully and open home page");

	}
	

}
*/
