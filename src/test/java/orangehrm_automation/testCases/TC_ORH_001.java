package orangehrm_automation.testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import orangehrm_automation.pageObjects.loginPage;

public class TC_ORH_001 {
	
	
	public static void main(String[] args) 
	
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String websiteName= driver.getTitle();
		
		Assert.assertEquals(websiteName, "OrangeHRM", "openSourceOrangeHRM");
		
		loginPage loginPage = new loginPage(driver);
		
		loginPage.login("Admin", "admin123");
		
		String profileName= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		
		System.out.println(profileName);
		Assert.assertEquals(profileName, "First Name Last Name", "Verifying Profile name");
		
		driver.quit();
		 

	}

}
