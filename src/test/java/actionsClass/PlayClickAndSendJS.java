package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayClickAndSendJS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com/");
		
		WebElement un = driver.findElement(By.id("user-name"));
				
		un.sendKeys("standard_user");
		
		WebElement pw = driver.findElement(By.id("password"));
		
		pw.sendKeys("secret_sauce");
		
		WebElement lgnbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		lgnbtn.click();
		
		
		
		
		
		

	}

}
