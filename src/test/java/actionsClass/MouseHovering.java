package actionsClass;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		
		//Identify Electronics and mouse hover on electronics
		WebElement targetEle = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		//Create object of actions class
		Actions act = new Actions(driver);
		
		//Perform mouse hovering
		act.moveToElement(targetEle).perform();
		System.out.println("Mouse hovering complete");
		
		Thread.sleep(1000);
		
		//Click on wired headphones after mouse hovering
		driver.findElement(By.linkText("Wired Headphones")).click();
		
		driver.findElement(By.linkText("Pink, In the Ear")).click();
		
		
		;
		
		

	}

}
