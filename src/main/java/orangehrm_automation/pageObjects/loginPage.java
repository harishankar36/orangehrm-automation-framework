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
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")
	WebElement usernameRequiredErrorMSG;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")
	WebElement passwordRequiredErrorMSG;
	
	@FindBy(xpath = "//h5[contains(@class,'orangehrm-login-title')]")
	WebElement login;
	
	
	
	//ActionMethods
	
	public String loginPageText()
	{
		String loginText = login.getText();
		return loginText;
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
	
	public void click_Submit()
	{
		signInButton.click();
		
	}
	
	public String usernameRequiredMSG()
	{
	String userNameRequired = usernameRequiredErrorMSG.getText();
	return userNameRequired;
	}
	
	public String passwordRequiredMSG()
	{
	String passwordRequired = passwordRequiredErrorMSG.getText();
	return passwordRequired;
	}
	
	
	
	
	
	
	

}
