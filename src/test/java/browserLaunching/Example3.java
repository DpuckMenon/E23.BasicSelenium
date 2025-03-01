package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Website opened");
		
		WebElement un = driver.findElement(By.className("input_error"));
		
		un.sendKeys("problem_user");
		System.out.println("Username Entered");
		
		WebElement pw = driver.findElement(By.name("password"));
		
		pw.sendKeys("secret_sauce");
		System.out.println("Paswword Entered");
		
		WebElement login = driver.findElement(By.className("btn_action"));
		
		login.click();
		System.out.println("Login button clicked");
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println("Window Minimized");
		
		
		
		
		
		
		
	}

}
