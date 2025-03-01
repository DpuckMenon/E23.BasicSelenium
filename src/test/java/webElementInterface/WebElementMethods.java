package webElementInterface;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://saucedemo.com/");

		//WebElement - I - sendKeys() - Enter data into text field
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).clear();
		
		driver.findElement(By.id("login-button")).click();
		
		String text = driver.findElement(By.xpath("//div[@class = 'login_logo']")).getText();
		System.out.println("Visible text is : " + text);
		
		String attributeValue = driver.findElement(By.id("password")).getAttribute("placeholder");
		System.out.println("Attribute value is : "+ attributeValue);
		
		String tagName = driver.findElement(By.id("password")).getTagName();
		System.out.println("Tag name is : " + tagName);
		
		//WebElement - I - getSize() - Dimension class - to get the size
		Point point = driver.findElement(By.id("password")).getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("Location is : "+x+","+y);
		
		//WebElement - I - getRect() - Rectangle class get location and also size
		Rectangle rec = driver.findElement(By.id("password")).getRect();
		int rx = rec.getX();
		int ry = rec.getY();
		int rh = rec.getHeight();
		int rw = rec.getWidth();
		System.out.println("Location - "+rx+ "," +ry+" Size - "+rh+"," +rw);
		
		//webElement - I - getCssValue() - Give the CSS property value for particular property
		String cssValue = driver.findElement(By.id("login-button")).getCssValue("cursor");
		System.out.println("Css Value is : "+ cssValue);
		
		//WebElement - I - getAriaRole() - Get the design of Web Element
		String arole = driver.findElement(By.id("login-button")).getAriaRole();
		System.out.println("Input type is : "+ arole);
		
		//WebElement - I - getAccessibleName() - Get the accessible name of the Web Element
		String ganame = driver.findElement(By.id("login-button")).getAccessibleName();
		System.out.println("Accessible Name is : "+ganame);
		
		//WebElement - I - getDOMAttribute - Get the value of the attribute name given
		String domAttributeValue = driver.findElement(By.id("user-name")).getDomAttribute("data-test");
		System.out.println("DOM Attribute Value is : "+ domAttributeValue);
		
		//WebElement - I - getDOMProperty - Get the value of from properties
		String getDOMProperty = driver.findElement(By.id("user-name")).getDomProperty("nodeName");
		System.out.println("DOM Property is : "+ getDOMProperty);
		
		//WebElement - I - getShadowRoot() - get the shadow roots of webpage
		SearchContext sroot = driver.findElement(By.id("user-name")).getShadowRoot();
		System.out.println(sroot);
		
		//WebElement - I - submit() - used to click() for type='submit'
		driver.findElement(By.id("login-button")).submit();
		System.out.println("Submit Executed");
		
		//WebElement - I - isDisplayed() - Check if the element is displayed in the DOM
		boolean display = driver.findElement(By.id("login-button")).isDisplayed();
		if(display==true) 
		{
			System.out.println("Element is displayed in DOM");
		}
		else
		{
			System.out.println("Element is not displayed in DOM");
		}
		
		//WebElement - I - isEnabled() - Check if the element is enabled in the DOM
		boolean enabled = driver.findElement(By.id("login-button")).isEnabled();
		if(enabled==true) 
		{
			System.out.println("Element is enabled in DOM");
		}
		else
		{
			System.out.println("Element is not enabled in DOM");
		}
		
		//WebElement - I - isSelected() - check if the element is selected or not
		boolean select = driver.findElement(By.id("login-button")).isSelected();
		if(select==true) 
		{
			System.out.println("Element is selected in DOM");
		}
		else
		{
			System.out.println("Element is not selected in DOM");
		}
		
		
		
		
		
		
	
		
	}

}
