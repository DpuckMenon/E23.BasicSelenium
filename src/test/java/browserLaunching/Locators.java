package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//Launch Browser
	WebDriver driver = new ChromeDriver();
	
	//Load URL
	driver.get("https://www.saucedemo.com/");
	
	//Maximize the Window
	driver.manage().window().maximize();
	System.out.println("maximized");
	
	//Identify the username with ID locator
	WebElement un = driver.findElement(By.id("user-name"));
	
	//Enter data into identified Username - Sendkeys() - WebElement - I
	un.sendKeys("standard_user");
	System.out.println("Username Entered");
		
	WebElement pw = driver.findElement(By.id("password"));
	
	pw.sendKeys("secret_sauce");
	System.out.println("Password Entered");
	
	WebElement login = driver.findElement(By.id("login-button"));
	
	login.click();
	System.out.println("Login button clicked");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
