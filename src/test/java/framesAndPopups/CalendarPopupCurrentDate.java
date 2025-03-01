package framesAndPopups;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import actionsClass.ClickAndSendKeysAction;

public class CalendarPopupCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		
		Date d = new Date();
		String ds = d.toString();
		System.out.println(ds);
		String [] dArr= ds.split(" ");
		String CurrentDate = dArr[0]+ " "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(CurrentDate);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.xpath("//label[@for = 'departure']")).click();
		
	 	
		//Select the current date - Dynamic Xpath
		WebElement ele = driver.findElement(By.xpath("//div[@aria-label = '"+CurrentDate+"']"));
		
		Thread.sleep(1000);
		ele.click();
		
		
		
	 	
	 	
		
		
		
		

	}

}
