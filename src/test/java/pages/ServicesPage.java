package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ServicesPage {
	
	public ServicesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath="//div[@id='BikeGear']")
	public WebElement BikeGear;
}
