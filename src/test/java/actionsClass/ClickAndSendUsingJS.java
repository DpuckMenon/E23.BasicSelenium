package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendUsingJS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='bluetooth earphones'", searchBar);
		
		js.executeScript("arguments[0].click()", searchBtn);
		
		
		
		
		

	}

}
