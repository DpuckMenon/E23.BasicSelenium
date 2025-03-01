package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Rule 1 - Create a separate POM class for every web page
		
		//Rule 2 - Identify the web elements using @FindBy - 'DECLARATION'
	
		@FindBy(name = "user-name")
		private WebElement usernameTextField;
		
		@FindBy(name = "password")
		private WebElement passwordTextField;
		
		@FindBy(name = "login-button")
		private WebElement loginButton;
		
		//Rule 3 - Create Constructor for element initialization - 'INITIALIZATION'
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);	
		}

		//Rule 4 - Provide getters for accessing the WebElements - 'UTILIZATION'
		//(right click and click on 'source' > Generate Getters and Setters > Select Getters)
		
		public WebElement getusernameTextField() {
			return usernameTextField;
		}

		public WebElement getpasswordTextField() {
			return passwordTextField;
		}

		public WebElement getloginButton() {
			return loginButton;
		}
	
			
		}
		
		
		
		
		
