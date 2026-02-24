package orangehrm_automation.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import orangehrm_automation.base_Package.base_Test;
import orangehrm_automation.pageObjects.loginPage;
import orangehrm_automation.pageObjects.profileHomepage;

public class TC_ORH_001 extends base_Test {
	
	
	public  void main(String[] args) 
	
	{
	
		
		
		
		//login Page
		loginPage loginPage = new loginPage(driver);
		Assert.assertEquals(loginPage.getWebsiteName(), "OrangeHRM", "openSourceOrangeHRM");
		loginPage.login("Admin", "admin123");
		
		//Profile Page
		profileHomepage profilePage = new profileHomepage(driver);
		Assert.assertEquals(profilePage.getProfileNAme(), "Travel Allowance Accommodation", "Verifying Profile name");
		 
		driver.quit();  
		  

	}

}
