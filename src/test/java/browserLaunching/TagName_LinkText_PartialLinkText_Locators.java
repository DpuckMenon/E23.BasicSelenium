package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_LinkText_PartialLinkText_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com/");
		
	//	WebElement title = driver.findElement(By.tagName("title"));
		
	//	String text = title.getTagName();
	//	System.out.println(text);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
	//	driver.findElement(By.id("logout_sidebar_link")).click();
		
	//	driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(1000);
	//	driver.findElement(By.linkText("About")).click();
		
	//	WebElement aboutLink = driver.findElement(By.linkText("About"));

	//	aboutLink.click();
		
		WebElement itemsLink = driver.findElement(By.partialLinkText("Items"));
		itemsLink.click();
		System.out.println("clicked");
		
	//	driver.findElement(By.cssSelector(null))
		
		
		
		
		
		
		
				
				
				
		
		
		//Thread.sleep(2000);
		//WebElement logout = driver.findElement(By.linkText("Logout"));
		
		//logout.click();
		
		
		
	}

}
