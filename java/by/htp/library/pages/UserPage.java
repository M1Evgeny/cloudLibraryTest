package by.htp.library.pages;

import org.openqa.selenium.WebDriver;

public class UserPage extends AbstractPage {

	public UserPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
