package orangehrm_automation.testCases;

import org.testng.annotations.Test;

import orangehrm_automation.Base.BaseTest;
import orangehrm_automation.pageObjects.LoginPage;


public class TC_ORH_E2E extends BaseTest{
	
	
	@Test
	public void TC_ORH_004()
	{
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.login("Admin", "admin123");
		
		//validating whether system is in the dashboard page
		
		
		
	}

}
