package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class forgotYourPasswordPage {
	
	public forgotYourPasswordPage() {
		PageFactory.initElements(BaseClass.getDriver(), true);
	}
	
	public static WebElement continueButton() {
		return BaseClass.getDriver().findElement(By.xpath("//*[@class='cea93c1fe cb2dfcee4 cb8f247a6 c5d1e7708 ceb1a35d1']"));
	}
	
	public static WebElement confirmationText() {
		return BaseClass.getDriver().findElement(By.xpath("//p[contains(text(), 'for instructions to reset your password.')]"));
	}
	
	public static WebElement forgotPwd2() {
        return BaseClass.getDriver().findElement(By.xpath("//*[@class='ce78228eb c80853310 cfe4c492b']"));
 }
}
