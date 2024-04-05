package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class StorePage_z {

	public StorePage_z() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//store 
	@FindBy(xpath ="//*[@class='find-a-store hmf-subheader-bold-l']")
	public WebElement findAStoreButton;
	//store 
	@FindBy(xpath ="//div[contains(@class, 'store-selection-modal-search-input')]//input[@placeholder='Enter Zip code']")
	public WebElement storeSearchBox;
	//store 
	@FindBy(xpath="//button[@aria-label='SEARCH']")
	public WebElement storeSearchButton;
	//store 
	@FindBy(xpath = "//div[@class='store-selection-modal-header hmf-p-s hmf-mb-xxxs hmf-body-bold-l']")
	public WebElement iframeStoreLocationBox;
	
	@FindBy(xpath="//*[@id='hmf-modal-container-id']")
	public WebElement storeResults;

	@FindBy(xpath="//*[@class='hmf-button  hmf-label-m medium-btn secondary-btn store-details-button']")
	public WebElement selectFairfaxStore;
	
	@FindBy(xpath="//*[@class='find-a-store hmf-subheader-bold-l hmf-text-transform-capitalize']")
	public WebElement storeTitle;

	
	 public String getSelectedStoreTitle() {
	        WebElement storeTitleElement = storeTitle;
	        return storeTitleElement.getText();

	 }

}     





	
			
	
	




