package orangehrm_automation.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm_automation.Base.BaseTest;
import orangehrm_automation.pageObjects.LoginPage;
import orangehrm_automation.pageObjects.PageObjectManager;


public class TC_ORH_E2E extends BaseTest{
	
	
	protected PageObjectManager pom;
	
	@BeforeMethod
	public void setupPages()
	{
		pom = new PageObjectManager(driver);
		
	}
	
	@Test
	public void TC_ORH_chk()
	{

		pom.getLoginPage().login("Admin", "admin123");
		
		//validating whether system is in the dashboard page
		
		
		
	}

}
