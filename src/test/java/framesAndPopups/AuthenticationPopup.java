package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actionsClass.ClickAndSendKeysAction;

public class AuthenticationPopup {

	public static void main(String[] args) {
		
		// Username = admin, password = admin
		//Syntax is https://username:password@URL
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
