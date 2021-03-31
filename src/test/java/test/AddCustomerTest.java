package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcustomerpage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	@Test
	public void usershouldbeabletocreatecustomer() {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.MainPageTitle();
		login.enterusername("demo@techfios.com");
		login.enterpassword("abc123");
		login.signin();

		DashBoardPage dash = PageFactory.initElements(driver, DashBoardPage.class);
		dash.validatedashboard();
		dash.abletoclickcustomersbutton();
		dash.abletoclickaddcustomerbutton();

		Addcustomerpage customer = PageFactory.initElements(driver, Addcustomerpage.class);
		customer.name("This is DogeCoin");
		customer.company("Techfios");
		customer.email("DogeCoin@gmail.com");
		customer.phone("666-555-");
		customer.address("1111 tree street");
		customer.city("philly");
		customer.state("new york");
		customer.zip("147895");
		customer.country("Netherlands Antilles");
		customer.save();

		BrowserFactory.TearDown();

	}
}
