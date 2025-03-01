package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		WebElement un = driver.findElement(By.name("user-name"));

		un.sendKeys("problem_user");

		WebElement pw = driver.findElement(By.name("password"));

		pw.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.name("login-button"));

		login.click();
		
		driver.manage().window().minimize();
		System.out.println("Minimized");
		

	}

}
