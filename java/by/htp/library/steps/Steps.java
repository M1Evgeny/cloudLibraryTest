package by.htp.library.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import by.htp.library.driver.DriverSingleton;
import by.htp.library.pages.LoginPage;
import by.htp.library.pages.UserPage;

public class Steps {

	private WebDriver driver;

	private static final Logger logger = LogManager.getLogger();

	public void initDriver() {
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver() {
		DriverSingleton.closeDriver();
	}

	public void authorize(String login, String pass) {
		LoginPage page = new LoginPage(driver);
		page.openPage();
		page.enterLogin(login);
		page.enterPassword(pass);
		page.clickButtonSingUp();
		logger.info("Login and pass were entered");
	}

	public String getPageTitle() {
		UserPage page = new UserPage(driver);
		return page.getPageTitle();
	}
}
