package webElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllProductNames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@class = 'submit-button btn_action']")).click();
		
		
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		
		for(WebElement prod : allproducts)
		{
			String productname = prod.getText();
			System.out.println("Product Name is : "+ productname);
			
		}
		
		List<WebElement> a= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		for(WebElement b : a) {
			
			String priceis = b.getText();
			System.out.println("Product price is :" + priceis);
			
			
		}
		
		
		
		
		
		

	}

}