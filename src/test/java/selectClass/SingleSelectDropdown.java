package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		WebElement ssd = driver.findElement(By.id("oldSelectMenu"));

		Select s = new Select(ssd);

		// Select option by index
		s.selectByIndex(5);
		System.out.println("Index 5 Selected");

		Thread.sleep(1000);

		// Select option by Value
		s.selectByValue("4");
		System.out.println("Value 4 Selected");

		Thread.sleep(1000);

		// Select option by Visible Text
		s.selectByContainsVisibleText("Magenta");
		System.out.println("Magenta Selected");

		// Select - Check if the dropdown is multi-select or not
		boolean temp = s.isMultiple();
		if (temp == true) {
			System.out.println("Yay! It is a multi-select dropdown");
		} else {
			System.out.println("Nay! It is Single-select dropdown");
		}
	
		//select - To get all the options in dropdown
		List<WebElement> list = s.getOptions();
		for(WebElement option:list) 
		{
		String optionText = option.getText();
		System.out.println(optionText);
		}
	
	}

}
