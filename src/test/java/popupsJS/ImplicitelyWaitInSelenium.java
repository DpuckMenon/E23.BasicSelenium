package popupsJS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("bluetooth earphones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> allEarPhones = driver.findElements(By.xpath("//span[contains(text (), 'Boult')]"));
		
		
		for(WebElement earphone : allEarPhones) {
			String earphoneName = earphone.getText();
			System.out.println(earphoneName);
			
		}
			driver.close();
		
	}

}
