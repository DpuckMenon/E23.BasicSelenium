package actionsClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollUsingJS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//Using JavaScript Executor - Scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll Down
		js.executeScript("window.scrollBy(0,1000);", "");
		
		Thread.sleep(1000);
		
		//Scroll Up
		js.executeScript("window.scrollBy(0,-1000);", "");
		
		//Scroll Right
		js.executeScript("window.scrollBy(1000,0):","");
		
		//Scroll Left
		js.executeScript("window.scrollBy(-1000,0):","");		
		
		
		

	}

}
