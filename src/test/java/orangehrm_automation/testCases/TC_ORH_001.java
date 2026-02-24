package orangehrm_automation.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm_automation.base_Package.base_Test;
import orangehrm_automation.pageObjects.loginPage;
import orangehrm_automation.pageObjects.profileHomepage;

public class TC_ORH_001 extends base_Test {
	
	@Test
	public  void TC_001() 
	
	{
		//login Page
		loginPage loginPage = new loginPage(driver);
		Assert.assertEquals(loginPage.getWebsiteName(), "OrangeHRM", "openSourceOrangeHRM");
		loginPage.login("Admin", "admin123");
		
		//Profile Page
		profileHomepage profilePage = new profileHomepage(driver);
		Assert.assertEquals(profilePage.getProfileNAme(), "Travel Allowance Accommodation", "Verifying Profile name");

	}
	
	 

}
