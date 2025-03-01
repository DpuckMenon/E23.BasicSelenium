package actionsClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SampleScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		//Take Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//temp location - Default
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Create dst location - current project
		File dst = new File("/Users/DE3P/eclipse-workspace/BasicSelenium.E23/Screenshots/take2.png");
		
		//Can also use . instead of the total location until the project name
		//File dst = new File("./Screenshots/take2.png");
		
		//Copy the screenshot from src to dst
		FileHandler.copy(src, dst);
		System.out.println("Screenshot Taken");
		
		
	}

}
