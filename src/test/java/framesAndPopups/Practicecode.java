package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicecode {

	public static void main(String[] args) {
		
		 WebDriver driver  = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Actions act = new Actions(driver);
		 act.moveByOffset(10, 10).click().perform();
		 
		 driver.findElement(By.xpath("//label[@for = 'departure']")).click();
		 
		 for (;;)
		 {
			 
			 try {
				 
				 driver.findElement(By.xpath("//div[@aria-label='Tue Jul 15 2025']")).click();
				 System.out.println("Loop executed");
				 break;
			 }
			 
				 catch (Exception e)
				 {
					 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				 }
			 
		 }
			 
		
	}

}
