package webElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopsAmazon {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.get("https://amazon.in/");
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptops");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	List<WebElement> laptops = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
	
	for (WebElement laptops1 : laptops)
	{
		
		String laptops2 = laptops1.getText();
		System.out.println(laptops2);
		
		if(laptops2.contains("HP"))
				
		{
			laptops1.click();
			System.out.println(laptops2);
			break;
		
		}
		
		
	}
	
	
	
	
	
	
		

	}

}
