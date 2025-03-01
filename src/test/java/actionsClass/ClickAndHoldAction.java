package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement ele = driver.findElement(By.xpath("//button[.='Click Me']"));
		
		Actions act = new Actions (driver);
		
		// Perform individually
		
		//act.clickAndHold(ele).perform();
		
		//act.release().perform();
		
		// Or together - Method chaining
		
		act.clickAndHold(ele).release().perform();
		
	}

}
