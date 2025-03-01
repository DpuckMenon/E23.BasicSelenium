package framesAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch the Selenium control to frame
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		System.out.println("Drag and Drop Performed");
		
		//Switch the Selenium control back to main page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//Click on a WebElement
		driver.findElement(By.linkText("Simple photo manager")).click();
		
		
		
	}

}
