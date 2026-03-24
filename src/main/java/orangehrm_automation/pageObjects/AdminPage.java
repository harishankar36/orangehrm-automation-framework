package orangehrm_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm_automation.Base.BasePage;

public class AdminPage extends BasePage {
	
WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
	WebElement adminHighlighted;
	
	
	public boolean validateUrl(String urlPart)
	{
		String url = driver.getCurrentUrl();
		boolean b = false ;
		String[] url2 = url.split("/");
		
		for(String a : url2)
		{
			if(a.equals(urlPart))
			{
				b = true;
			}
		}
		
		return b;
	}
	
	public boolean validateHighlightedAdminButton()
	{
		
		boolean a = adminHighlighted.isDisplayed();
		
		return a;
	}

}
