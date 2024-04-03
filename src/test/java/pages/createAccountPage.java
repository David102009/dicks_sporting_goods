package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class createAccountPage {

	public createAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//*[@class='ce78228eb cfe4c492b']")
	public WebElement joinNow;
	
	@FindBy(xpath="//*[@inputmode='email']")
	public WebElement createAccEmail;
	
	@FindBy(xpath = "//*[@id='password']")
	public WebElement createAccPassword;
	
	@FindBy(xpath = "//*[@name='action']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//*[@class='cea93c1fe cb2dfcee4 cb8f247a6 c5d1e7708 c471f9813']")
	public WebElement joinNowButton;
	
	@FindBy(xpath = "//*[@class='hmf-label-m homefield-button homefield-button-primary undefined']")
	public WebElement saveProfile;
	
	@FindBy(xpath = "//*[@clip-path='url(#DSG_Logo_2024_svg__a)']")
	public WebElement homeButton;
}
