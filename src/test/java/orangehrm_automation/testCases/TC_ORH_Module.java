package orangehrm_automation.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm_automation.base_Package.base_Test;
import orangehrm_automation.pageObjects.dashboardPage;
import orangehrm_automation.pageObjects.loginPage;
import orangehrm_automation.reusables.reusables;



public class TC_ORH_Module extends base_Test {
	
	

	
	@Test
	public  void TC_001() 
	
	{
		
		//Valid login with Admin credentials
		
		//login Page
		loginPage loginPage = new loginPage(driver);
		
		String pageName= loginPage.loginPageText();
		Assert.assertEquals(pageName, "Login", "openSourceOrangeHRM login page Icon");
		
		loginPage.login("Admin", "admin123");
		
		//dashboardPage
		dashboardPage profilePage = new dashboardPage(driver);
		Assert.assertEquals(profilePage.getProfileNAme(), "Travel Allowance Accommodation", "Verifying Profile name");
	}
	
	@Test
	public  void TC_002() 
	
	{
		//login Page
		loginPage loginPage = new loginPage(driver);
		
		String pageName= loginPage.loginPageText();
		Assert.assertEquals(pageName, "Login", "openSourceOrangeHRM login page Icon");

		// incorrect credentials
		loginPage.login("Admin", "wrongPass123");
		
		//validating error message
		String errorMessage= loginPage.getInvalidAccess();
		Assert.assertEquals(errorMessage, "Invalid credentials", "validating error meessage");
	}
	
	
	@Test()
	public void TC_ORH_003()
	{
		//Login with Blank Username and Password
		
		loginPage loginPage = new loginPage(driver);
		
		loginPage.click_Submit();
		
		String usernameError = loginPage.usernameRequiredMSG();
		String passwordError = loginPage.passwordRequiredMSG();
		
		Assert.assertEquals(usernameError, "Required", "validating password required notice");
		Assert.assertEquals(passwordError, "Required", "validating password required notice");
		
	}
	
	@Test()
	public void TC_ORH_004()
	{
		//login page
		loginPage loginPage = new loginPage(driver);
		
		Assert.assertEquals(loginPage.loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		loginPage.login("Admin", "admin123");
		
		//validating whether system is in Dashboard Page
		dashboardPage dashboardPage = new dashboardPage(driver);
		String dashboardtxt = dashboardPage.getDashboardDisplayTXT();
		Assert.assertEquals(dashboardtxt, "Dashboard", "validating whether system is inside dashboard");
		
		dashboardPage.logout();

		//validating whether system logged out successfully
		
		
	
	}
	 
	@Test()
	public void TC_ORH_005() 
	{
		//login page
		loginPage loginPage = new loginPage(driver);
		
		Assert.assertEquals(loginPage.loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		loginPage.login("Admin", "admin123");
		
		//validating whether system is in Dashboard Page
		dashboardPage dashboardPage = new dashboardPage(driver);
		String dashboardtxt = dashboardPage.getDashboardDisplayTXT();
		Assert.assertEquals(dashboardtxt, "Dashboard", "validating whether system is inside dashboard");
		
		dashboardPage.logout();

		//validating whether system logged out successfully
		Assert.assertEquals(loginPage.loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		
		//validating whether goes back in the browser to the Dashboard page
		reusables browser = new reusables(driver);
		browser.NavigateBack();
		
		//validating whether system remains in the login page
		Assert.assertEquals(loginPage.loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
			
	}
}
