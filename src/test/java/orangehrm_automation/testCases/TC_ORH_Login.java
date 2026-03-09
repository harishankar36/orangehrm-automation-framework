package orangehrm_automation.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm_automation.base_Package.base_Test;
import orangehrm_automation.pageObjects.loginPage;
import orangehrm_automation.pageObjects.profileHomepage;

public class TC_ORH_Login extends base_Test {
	
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
	
	@Test
	public  void TC_002() 
	
	{
		//login Page
		loginPage loginPage = new loginPage(driver);
		
		//validating main page
		Assert.assertEquals(loginPage.getWebsiteName(), "OrangeHRM", "openSourceOrangeHRM");
		
		// incorrect credentials
		loginPage.login("Admin", "wrongPass123");
		
		//validating error message
		String errorMessage= loginPage.getInvalidAccess();
		Assert.assertEquals(errorMessage, "Invalid credentials", "validating error meessage");
		
		
	}
	
	
	 

}
