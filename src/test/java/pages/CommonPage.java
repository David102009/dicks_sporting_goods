package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CommonPage {
	
	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='my-account-text hmf-display-flex hmf-align-content-center']")
	public WebElement loginPageButton;
	
	@FindBy(xpath = "//*[@clip-path='url(#DSG_Logo_2024_svg__a)']")
	public WebElement homeButton;
}