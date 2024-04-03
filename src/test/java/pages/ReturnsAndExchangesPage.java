package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ReturnsAndExchangesPage {
	
	public ReturnsAndExchangesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//div[@class='MuiContainer-root MuiContainer-maxWidthLg']/div/h3")
	public WebElement returnPolicySection;
	
	
	

}
