package orangehrm_automation.Base;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
 protected WebDriver driver;

public BasePage(WebDriver driver) {
    this.driver = driver;
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
