package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		
		WebElement addEle = driver.findElement(By.id("add"));
		
		WebElement minusEle = driver.findElement(By.id("minus"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(addEle).perform();
		System.out.println("Double clicked on add");
		
		Thread.sleep(1000);
		
		act.doubleClick(addEle).perform();
		System.out.println("Double clicked again on add");
		
		Thread.sleep(1000);
		
		act.doubleClick(minusEle).perform();
		System.out.println("Double clicked on minus");
		
		Thread.sleep(1000);
		
		act.doubleClick(minusEle).perform();
		System.out.println("Double clicked again on minus");
		
		
		
		
		
		

	}

}
