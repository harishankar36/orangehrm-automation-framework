package orangehrm_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage DashboardPage;
    private AdminPage AdminPage;
    
    public PageObjectManager(WebDriver driver)
	{
			this.driver= driver;
		
	}
    
    public LoginPage getLoginPage() 
    {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    
    
    public DashboardPage getDashboardPage() 
    {
        if (DashboardPage == null) {
        	DashboardPage = new DashboardPage(driver);
        }
        return DashboardPage;
    }
    
    public AdminPage getAdminPage() 
    {
        if (AdminPage == null) {
        	AdminPage = new AdminPage(driver);
        }
        return AdminPage;
    }
    
    
    
    
}

