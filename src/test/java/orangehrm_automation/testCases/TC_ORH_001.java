package orangehrm_automation.testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC_ORH_001 {
	
	
	public static void main(String[] args) 
	
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String websiteName= driver.getTitle();
		
		Assert.assertEquals(websiteName, "OrangeHRM", "openSourceOrangeHRM");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String profileName= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		
		System.out.println(profileName);
		Assert.assertEquals(profileName, "First Name Last Name", "Verifying Profile name");
		
		driver.quit();
		

	}

}
