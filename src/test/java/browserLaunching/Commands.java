package browserLaunching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {

		// Launch Firefox Browser

		WebDriver driver = new FirefoxDriver();

		// To load the URL

		driver.get("https://www.flipkart.com/");

		// To fetch the page title

		String title = driver.getTitle();
		System.out.println(title);

		// To fetch the current URL

		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		// To fetch the Window ID
		String winID = driver.getWindowHandle();
		System.out.println(winID);

		// To fetch the Window IDs - Multiple Windows
		Set<String> winIDs = driver.getWindowHandles();
		for (String win : winIDs) {
			System.out.println(win);
		}

		// To close the current window of browser

		driver.close();

		// To close all windows of browser

		driver.quit();

		// Navigation Methods

		Navigation nav = driver.navigate();
		nav.refresh();
		System.out.println("Page Refreshed");

		nav.back();
		System.out.println("Went back");

		nav.forward();
		System.out.println("Went forward");

		nav.to("https://www.amazon.in//");
		System.out.println("New URL loaded");

		driver.navigate().refresh(); // Method Chaining
		System.out.println("New URL refreshed");

		// Manage Methods

		Options op = driver.manage();
		Window wind = op.window(); // Maximize, Minimize, Fullscreen
		Timeouts time = op.timeouts(); // Add time delays

		// Window Methods of Options

		wind.maximize();
		System.out.println("Current page is maximized");

		wind.fullscreen();
		System.out.println("Fullscreen");

		Thread.sleep(300);
		wind.minimize();
		System.out.println("Current page is minimized");

		driver.manage().window().maximize(); // Method Chaining
		System.out.println("Maximized again using method chaining");

		// Switch Methods

		TargetLocator targetLoc = driver.switchTo();
		targetLoc.window(winID); // Switch Selenium control to this window
		
		//Identify the username with ID locator
		WebElement un = driver.findElement(By.id("user-name"));
		
		//Enter data into identified Username - Sendkeys() - WebElement - I
		un.sendKeys("standard_user");
		System.out.println("Username Entered");
		
		//Identify the Password with ID locator
		WebElement pw = driver.findElement(By.id("password"));
		
		pw.sendKeys("secret_sauce");
		System.out.println("Password Entered");
		
		//Identify the Login button with ID locator
		WebElement login = driver.findElement(By.id("login-button"));
		
		//Click on the login button
		login.click();
		System.out.println("Login button clicked");
		
		
		//Identify the username1 with NAME locator
		WebElement VariableName  = driver.findElement(By.name("user-name"));

		un.sendKeys("problem_user");

		//Identify the Password with NAME locator1
		WebElement VariableName1 = driver.findElement(By.name("password"));

		pw.sendKeys("secret_sauce");

		//Identify the Login button with NAME locator
		WebElement VariableName2 = driver.findElement(By.name("login-button"));

		login.click();
		

	}

}