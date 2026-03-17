package orangehrm_automation.reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class reusables {
	
	WebDriver driver;
	
public reusables(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void NavigateBack()
	{
		driver.navigate().back();
	}

}
