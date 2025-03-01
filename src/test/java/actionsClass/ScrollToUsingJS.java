package actionsClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToUsingJS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//Scroll to Extremes
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to extreme bottom 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);","");
		
		Thread.sleep(3000);
		
		//Scroll to extreme top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);","");
		
		//Scroll Right
		js.executeScript("window.scrollTo(document.body.scrollWidth,0);", "");
		
		//Scroll Left
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0);", "");
		
		
		
		
		
		
		
		

	}

}
