package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;



public class logOutPage{

	public logOutPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//hmf-button[@aria-label='Sign Out']")
	public WebElement signOutButton;
	
	@FindBy(xpath="//span[contains(text(), 'Sign In to Earn Points')]")
	public WebElement confirmSignedOut;
	
}
