package actionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseByOffsetAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://makemytrip.com/");
		
		Thread.sleep(2000);
		
		//Avoid popup using move by offset
		Actions act = new Actions(driver);
		
		//use move by offset method
		act.moveByOffset(10, 10).click().perform();
		System.out.println("move by offset values of 10,10 and clicked");
		
		
	}

}
