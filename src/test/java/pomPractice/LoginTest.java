package pomPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) throws IOException {
		
	FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
	
	Properties p = new Properties();
	
	p.load(fis);
	
	String URL = p.getProperty("url");
	String USERNAME = p.getProperty("user-name");
	String PASSWORD = p.getProperty("password");
	
	//Launch Browser
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Load URL
	driver.get(URL);
	
	//Login to Application
	//driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	//driver.findElement(By.id("password")).sendKeys(PASSWORD);
	//driver.findElement(By.id("login-button")).click();
	
	LoginPage lp = new LoginPage(driver);
	lp.getusernameTextField().sendKeys(USERNAME);
	lp.getpasswordTextField().sendKeys(PASSWORD);
	lp.getloginButton().click();
	
	
	
	
	
	
	
	
	}
	
	}

	

