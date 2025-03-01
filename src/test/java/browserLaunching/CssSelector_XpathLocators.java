package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		// input.submit-button bcos	 class = submit-button
		driver.findElement(By.cssSelector("input.submit-button")).click(); //can also write ("input[type = 'password']"))
		
		
	}

}
