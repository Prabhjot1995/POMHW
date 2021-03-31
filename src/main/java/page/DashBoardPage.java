package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//h2[text()=' Dashboard ']")
	WebElement DASHBOARD_HEADER_FEILD;
	@FindBy(xpath= "//span[text()='Customers']")
	WebElement CUSTOMERS_BUTTON;
	@FindBy(xpath = "//a[text()='Add Customer']")
	WebElement ADD_CUSTOMER_BUTTON;

	public void validatedashboard() {
		waitForElement(driver, 5, DASHBOARD_HEADER_FEILD);
		Assert.assertEquals(DASHBOARD_HEADER_FEILD.getText(), "Dashboard", "DashBoard Page Not Found!!");
	}

	public void abletoclickcustomersbutton() {
		waitForElement(driver, 5, CUSTOMERS_BUTTON);
		CUSTOMERS_BUTTON.click();

	}
	public void abletoclickaddcustomerbutton() {
		waitForElement(driver, 5, ADD_CUSTOMER_BUTTON);
		ADD_CUSTOMER_BUTTON.click();

	}

}
