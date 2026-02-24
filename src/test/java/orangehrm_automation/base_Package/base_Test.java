package orangehrm_automation.base_Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import orangehrm_automation.pageObjects.loginPage;

public class base_Test {

	
	loginPage loginPage;
	public WebDriver driver = null;
	
	@BeforeMethod
	public void initialize_Driver() throws IOException
	{
		
		
		// loading browser name from property file
		FileInputStream fis = new FileInputStream("C:\\Users\\hari4\\Projects\\Selenium\\orangehrm-automation\\src\\main\\java\\orangehrm_automation\\resources\\globalData.properties");
		Properties p = new Properties();
		p.load(fis);
		
		
		String browserName = p.getProperty("browser");
		
		//choosing Browser
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();	
		}else if (browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();	
		}	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("url"));
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}



	
	
}
