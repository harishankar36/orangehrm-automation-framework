package orangehrm_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class profileHomepage {
	
	WebDriver driver;
	
	public profileHomepage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement profileName;
	
	
	public String getProfileNAme()
	{
		String pName= profileName.getText();
		return pName;
		
	}

}
