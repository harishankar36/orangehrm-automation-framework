package orangehrm_automation.testCases;

import org.testng.annotations.Test;

import orangehrm_automation.base_Package.base_Test;
import orangehrm_automation.pageObjects.loginPage;


public class TC_ORH_E2E extends base_Test{
	
	
	@Test
	public void TC_ORH_004()
	{
		loginPage loginPage = new loginPage(driver);
		
		loginPage.login("Admin", "admin123");
		
		//validating whether system is in the dashboard page
		
		
		
	}

}
