package by.htp.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	private final String URL = "http://node51579-env-1995265.mycloud.by/login.jsp";
	By txbLogin = By.name("login");
	By txbPass = By.name("password");
	By btnSubmit = By.xpath("//*[@id='login_form']/button");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);
	}

	public void enterLogin(String login) {
		getElement(txbLogin).sendKeys(login);
	}

	public void enterPassword(String password) {
		getElement(txbPass).sendKeys(password);
	}

	public void clickButtonSingUp() {
		getElement(btnSubmit).click();
	}

}
