package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement USER_NAME_FEILD;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PASSWORD_FEILD;
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement SIGNIN_BUTTON;

	public void MainPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Login - iBilling", "Main Page Not Found");
	}

	public void enterusername(String username) {
		USER_NAME_FEILD.sendKeys(username);
	}

	public void enterpassword(String password) {
		PASSWORD_FEILD.sendKeys(password);
	}

	public void signin() {
		SIGNIN_BUTTON.click();
	}
}
