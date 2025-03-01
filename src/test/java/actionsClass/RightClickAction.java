package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement targetEle = driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions act = new Actions (driver);		
		
		act.contextClick(targetEle).perform();
		System.out.println("Right click performed");
		
		driver.findElement(By.xpath("//span[.='Edit']")).click();
		
		
		
		
		
		
	}

}
