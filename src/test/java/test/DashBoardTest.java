package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashBoardTest {
	WebDriver driver;

	@Test
	public void verifydashboard() {
		driver = BrowserFactory.init();
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.MainPageTitle();
		page.enterusername("demo@techfios.com");
		page.enterpassword("abc123");
		page.signin();

		DashBoardPage dash = PageFactory.initElements(driver, DashBoardPage.class);
		dash.validatedashboard();
		dash.abletoclickcustomersbutton();
		dash.abletoclickaddcustomerbutton();

		BrowserFactory.TearDown();
	}
}
