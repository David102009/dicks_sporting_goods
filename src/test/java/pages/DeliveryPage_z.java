package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DeliveryPage_z {
	public DeliveryPage_z() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}	
	
	// delivery 
	@FindBy(xpath = "//*[@class=\"header-same-day-delivery-button-zipCode hmf-my-0 hmf-subheader-bold-l\"]")
	public WebElement deliveryButton;
	// delivery 
	@FindBy(xpath ="//div[@class='sdd-modal-v2-content']")
	public WebElement iframeDeliveryLocationBox;
	// delivery 
	@FindBy(xpath="//input[@type='number'][@placeholder='Enter Zip Code']")
	public WebElement deliverySearchBox;
	// delivery 
	@FindBy(xpath="//*[@id='hmf-modal-container-id']/div[2]/div[2]/div[2]/button")
	public WebElement deliveryUpdateButton;
	
	@FindBy(xpath ="//*[@id=\"responsive-header\"]/div/div[3]/div/div[5]/div/div/p[1]")
	public WebElement changedDeliveryLocation;

	public String getZipCodeTitle() {
	    WebElement deliveryLocation = changedDeliveryLocation;
	    return deliveryLocation.getText();
	}
}
