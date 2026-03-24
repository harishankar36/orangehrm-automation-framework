package orangehrm_automation.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm_automation.Base.BaseTest;
import orangehrm_automation.pageObjects.AdminPage;
import orangehrm_automation.pageObjects.DashboardPage;
import orangehrm_automation.pageObjects.LoginPage;
import orangehrm_automation.pageObjects.PageObjectManager;



public class TC_ORH_Module extends BaseTest {
	
	PageObjectManager pom;
	
	@BeforeMethod
	public void setupPages() {
	    pom = new PageObjectManager(driver);
	}

	
	@Test
	public  void TC_ORH_001() 
	
	{
		
		String pageName= pom.getLoginPage().loginPageText();
		Assert.assertEquals(pageName, "Login", "openSourceOrangeHRM login page Icon");
		pom.getLoginPage().login("Admin", "admin123");
		Assert.assertEquals(pom.getDashboardPage().getProfileNAme(), "Travel Allowance Accommodation", "Verifying Profile name");
	}
	
	@Test
	public  void TC_ORH_002() 
	
	{
		
		
		String pageName= pom.getLoginPage().loginPageText();
		Assert.assertEquals(pageName, "Login", "openSourceOrangeHRM login page Icon");

		// incorrect credentials
		pom.getLoginPage().login("Admin", "wrongPass123");
		
		//validating error message
		String errorMessage= pom.getLoginPage().getInvalidAccess();
		Assert.assertEquals(errorMessage, "Invalid credentials", "validating error meessage");
	}
	
	
	@Test()
	public void TC_ORH_003()
	{
		//Login with Blank Username and Password
		
		
		pom.getLoginPage().click_Submit();
		
		String usernameError = pom.getLoginPage().usernameRequiredMSG();
		String passwordError = pom.getLoginPage().passwordRequiredMSG();
		
		Assert.assertEquals(usernameError, "Required", "validating password required notice");
		Assert.assertEquals(passwordError, "Required", "validating password required notice");
		
	}
	
	@Test()
	public void TC_ORH_004()
	{
		
		
		Assert.assertEquals(pom.getLoginPage().loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		pom.getLoginPage().login("Admin", "admin123");
		
		//validating whether system is in Dashboard Page
		
		String dashboardtxt = pom.getDashboardPage().getDashboardDisplayTXT();
		Assert.assertEquals(dashboardtxt, "Dashboard", "validating whether system is inside dashboard");
		
		pom.getDashboardPage().logout();

		//validating whether system logged out successfully
		String pageName= pom.getLoginPage().loginPageText();
		Assert.assertEquals(pageName, "Login", "openSourceOrangeHRM login page Icon");
		
		
	
	}
	 
	@Test()
	public void TC_ORH_005() throws InterruptedException 
	{
	
		//validating whether user is in the login page
		Assert.assertEquals(pom.getLoginPage().loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		pom.getLoginPage().login("Admin", "admin123");
		
		//validating whether system is in Dashboard Page

		String dashboardtxt = pom.getDashboardPage().getDashboardDisplayTXT();
		Assert.assertEquals(dashboardtxt, "Dashboard", "validating whether system is inside dashboard");
		
		pom.getDashboardPage().logout();

		//validating whether system logged out successfully
		Assert.assertEquals(pom.getLoginPage().loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
		
		//validating whether goes back in the browser to the Dashboard page
		Thread.sleep(5000);
		pom.getLoginPage().navigateBack();
		
		Thread.sleep(5000);
		//validating whether system remains in the login page
		Assert.assertEquals(pom.getLoginPage().loginPageText(), "Login", "openSourceOrangeHRM login page Icon");
			
	}
	
	
	@Test()
	public void TC_ORH_006()
	{
		
		pom.getLoginPage().login("Admin", "admin123");
		String dashboardtxt = pom.getDashboardPage().getDashboardDisplayTXT();
		Assert.assertEquals(dashboardtxt, "Dashboard", "validating whether system is inside dashboard");
		pom.getDashboardPage().clickAdminButton();
		Boolean checkURLPart = pom.getAdminPage().validateUrl("viewSystemUsers");
		Boolean checkIfAdminBtnHighlighted = pom.getAdminPage().validateHighlightedAdminButton();	
		Assert.assertTrue(checkURLPart);
		Assert.assertTrue(checkIfAdminBtnHighlighted);

		
	}
}
