package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement srcEle = driver.findElement(By.xpath("//div[.='Copenhagen'][2]"));
		
		WebElement tarEle = driver.findElement(By.xpath("//div[.='Denmark']"));
		
		Actions act = new Actions (driver);
		
		act.dragAndDrop(srcEle, tarEle).perform();
		
		System.out.println("Drag and drop done");
		
		
		

	}

}
