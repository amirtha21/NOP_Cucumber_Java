package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitHelper {
	
	public WebDriver driver;
	
	public waitHelper(WebDriver driver) {
	this.driver = driver;

 }
	//when i search webelements in the webpage to visible elements (maximum) here we used (user define elements)
	public void waitForElement(WebElement element,long timeOutInseconds) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutInseconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}