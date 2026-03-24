package orangehrm_automation.Base;

import org.openqa.selenium.WebDriver;

import utilities.WaitUtills;

public class BasePage {
	
	
 protected WebDriver driver;
 protected WaitUtills waitUtills;

public BasePage(WebDriver driver) {
 this.driver = driver;
 this.waitUtills = new WaitUtills(driver); 
}


public void navigateBack() {
    driver.navigate().back();
}

public void navigateForward() {
    driver.navigate().forward();
}

public void refreshPage() {
    driver.navigate().refresh();
}

public String getCurrentUrl() {
    return driver.getCurrentUrl();
}



}
