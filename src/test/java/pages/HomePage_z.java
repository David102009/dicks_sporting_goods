package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.BaseClass;

public class HomePage_z {
	public HomePage_z() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='header-logo']")
	public WebElement homePageLogo;

	public void assertAndPrintCurrentUrl() {

		String currentUrl = BaseClass.driver.getCurrentUrl();
		String expectedUrl = BaseClass.getMyProperty("expectedUrl");
		Assert.assertEquals(currentUrl, expectedUrl, "The current URL does not match the expected URL.");
		System.out.println("Current URL: " + currentUrl + " | Expected URL: " + expectedUrl);
	}

}
