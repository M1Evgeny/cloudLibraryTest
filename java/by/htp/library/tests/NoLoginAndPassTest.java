package by.htp.library.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.library.steps.Steps;
import by.htp.library.utils.PropertiesManager;

public class NoLoginAndPassTest {
	private Steps steps;
	private String login = "";
	private String pass = "";
	private String pageTitle = PropertiesManager.getProperty("library.title");

	@BeforeMethod
	public void beforeMethod() {
		steps = new Steps();
		steps.initDriver();
	}

	@Test
	public void loginWithoutPassAndLogin() {
		steps.authorize(login, pass);
		Assert.assertEquals(pageTitle, steps.getPageTitle(), "User gain access!");
	}

	@AfterMethod
	public void afterMethod() {
		steps.closeDriver();
	}
}
