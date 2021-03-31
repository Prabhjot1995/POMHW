package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void waitForElement(WebDriver driver,int TimeInsecond,WebElement elementLocator) {
		WebDriverWait wait = new WebDriverWait(driver,TimeInsecond);
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}
	
	public int randomnumbers(int gennum) {
		Random num = new Random();
		int random = num.nextInt(gennum);
		return random;
	}
	public void SelectDropDown(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
}
