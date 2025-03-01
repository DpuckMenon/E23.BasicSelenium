package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shine.com/registration/");
		
		//waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement upload = driver.findElement(By.xpath("//input[@type = 'file']"));
		
		//upload file using the file location
		
		upload.sendKeys("/Users/DE3P/Downloads/DEEPAK S.docx");
		
		System.out.println("file upload successful");
		
		
	}

}
