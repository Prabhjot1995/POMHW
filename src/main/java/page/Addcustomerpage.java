package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcustomerpage extends BasePage{
	WebDriver driver;
	
	public Addcustomerpage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='account']")
	WebElement FULL_NAME;
	@FindBy(xpath="//select[@id='cid']")
	WebElement COMPANY_NAME;
	@FindBy(xpath="//input[@id='email']")
	WebElement EMIAL_FEILD;
	@FindBy(xpath="//input[@id='phone']")
	WebElement PHONE_NUMBER_FEILD;
	@FindBy(xpath="//input[@id='address']")
	WebElement ADDRESS_FEILD;
	@FindBy(xpath="//input[@id='city']")
	WebElement CITY_FEILD;
	@FindBy(xpath="//input[@id='state']")
	WebElement STATE_FEILD;
	@FindBy(xpath="//input[@id='zip']")
	WebElement ZIP_CODE_FEILD;
	@FindBy(xpath="//select[@id='country']")
	WebElement COUNTRY_DROPDOWN;
	@FindBy(xpath="//button[@id='submit']")
	WebElement SUBMIT_BUTTON;
	
	public void name(String firstname) {
		int genNum = randomnumbers(999);
		FULL_NAME.sendKeys(firstname+genNum);
	}
	public void company(String companyname) {
		SelectDropDown(COMPANY_NAME,companyname);
		
	}
	public void email(String emailinput) {
		int num=randomnumbers(999);
		EMIAL_FEILD.sendKeys(num+emailinput);
	}
	public void phone(String phonenum) {
		int Pnum=randomnumbers(999);
		PHONE_NUMBER_FEILD.sendKeys(phonenum+Pnum);
	}
	public void address(String location) {
		ADDRESS_FEILD.sendKeys(location);
		
	} 
	public void city(String city) {
		CITY_FEILD.sendKeys(city);
	}
	public void state(String state) {
		STATE_FEILD.sendKeys(state);
	}
	public void zip(String code) {
		ZIP_CODE_FEILD.sendKeys(code);
	}
	public void country(String value) {
		SelectDropDown(COUNTRY_DROPDOWN,value);
	}
	public void save() {
		SUBMIT_BUTTON.click();
	}
}
