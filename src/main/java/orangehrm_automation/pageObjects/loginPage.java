package orangehrm_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//WebElements
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signInButton;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement invalidCredentials;
	
	
	//ActionMethods
	
	public String getWebsiteName()
	{
		String websiteName= driver.getTitle();
		return websiteName;
	}
	
	public void login(String userID, String Password)
	{
		userName.sendKeys(userID);
		password.sendKeys(Password);
		signInButton.click();
	}
	
	public String getInvalidAccess()
	{
		String errorMessage = invalidCredentials.getText();
		
		return errorMessage;
	}
	
	
	
	

}
