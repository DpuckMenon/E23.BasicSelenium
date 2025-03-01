package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActions {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://selenium.dev/downloads/");
	
	Actions act = new Actions(driver);
	
	//act.scrollByAmount(0, 2000).perform();
	
	//Thread.sleep(1000);
	
	//act.scrollByAmount(0, -500).perform();
	
	WebElement refEle = driver.findElement(By.xpath("//img[@title = 'Sauce Labs']"));
	
	act.scrollToElement(refEle).perform();
	
	
	
	
	}

}
