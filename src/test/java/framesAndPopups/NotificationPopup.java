package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		
		//disable popups using browser setting
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.yatra.com/");
		
		
		

	}

}
