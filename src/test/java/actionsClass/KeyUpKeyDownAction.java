package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDownAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com/");
		
		WebElement un = driver.findElement(By.id("user-name"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).perform();
		act.sendKeys(un,"deep").perform();
		act.keyUp(Keys.SHIFT).perform();
	
		
		
	}

}
