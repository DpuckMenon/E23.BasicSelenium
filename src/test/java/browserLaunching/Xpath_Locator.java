package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@class = 'input_error form_input' and @placeholder='Password']")).sendKeys("secret_sauce");
		
		//find by Text
		
		//driver.findElement(By.xpath("//div[@text(),'Swag Labs']"))
		
		//find by contains
		
		//driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
		
		driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
		
		
		
		
		
		

		
		
		
		

	}

}
