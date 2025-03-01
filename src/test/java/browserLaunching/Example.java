package browserLaunching;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		// To fetch the page title

		String title = driver.getTitle();
		System.out.println(title);

		// To fetch the current URL

		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		String winID = driver.getWindowHandle();
		System.out.println(winID);

		Set<String> winIDs = driver.getWindowHandles();
		for (String win : winIDs) {
			System.out.println(win);
		}

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

		driver.switchTo().window(winID);

		// String pageSource = driver.getPageSource();
		// System.out.println(pageSource);
		// To close the current window of browser

		// driver.close();

		// driver.quit();

	}

}