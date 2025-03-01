package webElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureEarphonesAmazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://amazon.in/");

		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Bluetooth earphones");

		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> ep = driver.findElements(By.xpath("//span[contains(text(),'Boult')]"));

		for (WebElement ep1 : ep) {

			String ep2 = ep1.getText();
			System.out.println(ep2);

		}

	}

}
