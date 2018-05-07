package by.htp.library.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.library.steps.Steps;
import by.htp.library.utils.PropertiesManager;

public class WrongPassTest {
	private Steps steps;
	private String login = PropertiesManager.getProperty("library.login");
	private String pass = PropertiesManager.getProperty("library.wrongPass");
	private String pageTitle = PropertiesManager.getProperty("library.login.title");

	@BeforeMethod
	public void beforeMethod() {
		steps = new Steps();
		steps.initDriver();
	}

	@Test
	public void wrongPasslogin() {
		steps.authorize(login, pass);
		Assert.assertEquals(pageTitle, steps.getPageTitle(), "User gain access with wrong password!");
	}

	@AfterMethod
	public void afterMethod() {
		steps.closeDriver();
	}
}
