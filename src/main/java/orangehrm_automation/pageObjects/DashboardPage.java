package orangehrm_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm_automation.Base.BasePage;


public class DashboardPage extends BasePage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		
		super(driver);
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement profileName;
	
	@FindBy(xpath = "//h6[contains(@class,'oxd-topbar-header-breadcrumb-module')]")
	WebElement dashboard;
	
	@FindBy(xpath = "//i[contains(@class, 'bi-caret-down-fill')]")
	WebElement profileDropdown;
	
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li[4]")
	WebElement logout;
	

	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper'][1]")
	WebElement adminButton;
	
	
	
	//Action methods
	
	public String getProfileNAme()
	{
		//this method gets the profile name
		String pName= profileName.getText();
		return pName;
		
	}
	
	public String getDashboardDisplayTXT()
	{
		String dashboardtxt= dashboard.getText();
		return dashboardtxt;	
	}
	
	public void logout()
	{
		
		profileDropdown.click();
		logout.click();
	}
	
	public void clickAdminButton()
	{
		adminButton.click();
	}
	
	
	

}
