package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeysAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com/");
		
		WebElement un = driver.findElement(By.id("user-name"));
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		
		Actions act = new Actions (driver);
		
		act.sendKeys(un,"standard_user",Keys.TAB,"secret_sauce").perform();
		act.click(loginbtn).perform();
		//Could also use - loginbtn.click();
		
		
	}

}
