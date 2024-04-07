package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;
import utilities.commonMethods;

public class PaolaProductPage {

	public PaolaProductPage() {
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	
	public WebElement addidasGazelleShoeNavyTanColorSelection() {
		return BaseClass.getDriver().findElement(By.xpath("//*[@id='swatch_entitledItem_Navy_Tan_swatch']"));
	}
	
	@FindBy(xpath="//div[@class='color-container row ng-star-inserted']//*[@class='selected-attribute-title hmf-header-xs ng-star-inserted']")
	public WebElement addidasGazelleShoeNavyTanLabel;
	
	public WebElement DSGLeggingsPacificAzureColorSelection() {
		return BaseClass.getDriver().findElement(By.xpath("//*[@id='swatch_entitledItem_Pacific_Azure_swatch']"));
	}
	public WebElement DSGLeggingsSizeMButton() {
		return BaseClass.getDriver().findElement(By.xpath("//button[@class='btn-attr-select block-attr-block ng-star-inserted']//span[@id='block-swatch_Size_2']"));
		
	}
	
	@FindBy(xpath="//div[@id='attr_Size']//span[@class='selected-attribute-title hmf-header-xs ng-star-inserted']")
	public WebElement DSGLeggingsSizeLabel;
	
	public WebElement reviewsSummary() {
		return BaseClass.getDriver().findElement(By.xpath("//div[@class='bv-secondary-summary']"));
	}
	
	public WebElement NikeMetconWriteReviewButton() {
		return BaseClass.getDriver().findElement(By.xpath("//div[@class='bv-write-review-container bv-write-container']"));
	}
	
	@FindBy(xpath="//div[@class='bv-mbox-content-container']//span[@class='bv-mbox-breadcrumb-item']")
	public WebElement MyReviewForNikeMensMetcon9TrainingShoes;
	
	@FindBy(xpath="//*[@id='attr_Color1']")
	public WebElement nikeMetConColors;
	
	@FindBy(xpath="//div[@class='mx-auto hmf-mb-md-l']")
	public WebElement nikeMetcon9ViewAllImagesButton;
	
	@FindBy(xpath="//h2[@class='description-header flex-grow-1 ng-tns-c747858093-1']")
	public WebElement poductInformationHeader;
	
	@FindBy(xpath="//hr[@class='header-hr sponsored-header-hr-override ng-star-inserted']")
	public WebElement sponsoredHeader;
	
	@FindBy(xpath="//ul[@class='list-unstyled product-numbers']")
	public WebElement productWebId;
	
	@FindBy(xpath="//div[@id='afterpay-ad-wrapper']")
	public WebElement afterPayMessage;
	
	
	public WebElement youMayAlsoLikeHeader() {
		return BaseClass.getDriver().findElement(By.xpath("//div[@id='product_rr']//span[@class='hmf-pl-s hmf-pl-m-0 ng-star-inserted']"));
	}
	
	@FindBy(xpath="//span[@id='bv-radio-rating-5']")
	public WebElement review5StarButton;
	
	@FindBy(xpath="//input[@id='bv-text-field-title']")
	public WebElement reviewTitleInput;
	
	@FindBy(xpath="//textarea[@id='bv-textarea-field-reviewtext']")
	public WebElement reviewTextBox;
	
	@FindBy(xpath="//input[@id='bv-text-field-usernickname']")
	public WebElement reviewNicknameInputBox;
	
	@FindBy(xpath="//input[@id='bv-text-field-userlocation']")
	public WebElement reviewLocationInputBox;
	
	@FindBy (xpath="//input[@class='bv-text bv-focusable bv-email']")
	public WebElement reviewEmailInputBox;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_YourAge_2']")
	public WebElement reviewYourAgeSelect;
	
	@FindBy(xpath="//option[@value='1824']")
	public WebElement reviewYourAgeDropdown1824Option;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_Gender']")
	public WebElement reviewYourGenderSelect;
	
	@FindBy(xpath="//span[@class='bv-fieldset-select-wrapper']//option[@value='Female']")
	public WebElement reviewYourGenderDropdownFemaleOption;
	
	@FindBy(xpath="bv-select-field-contextdatavalue_OwnedFor")
	public WebElement reviewHowLongYouOwnSelect;
	
	@FindBy(xpath="//select[@name='contextdatavalue_OwnedFor']//option[@value='6months']")
	public WebElement reviewHowLongYouOwnDropdown6Months;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_POS']")
	public WebElement reviewPurchaseLocationSelect;
	
	@FindBy(xpath="//select[@id='bv-dropdown-select-25']//option")
	public List<WebElement> reviewPurchaseLocationOptions;
	
	@FindBy(xpath="//select[@id='bv-dropdown-select-25']//option[@value='InStore']")
	public WebElement reviewPurchaseLocationDropdownOnlineOption;
	
	public void reviewPurchaseLocationDropdownSelectOptions(String optionText) {
		for(WebElement option: reviewPurchaseLocationOptions) {
			if (option.getText().equals(optionText)) {
				option.click();
				break;
			}
		}
		
	}
	
	@FindBy(xpath="//span[@id='bv-radio-rating_Value-5']")
	public WebElement reviewValue5StarButton;
	
	@FindBy(xpath="//span[@id='bv-radio-rating_Quality_1-5']")
	public WebElement reviewQuality5StarButton;
	
	@FindBy(xpath="//label[@id='bv-radio-rating_FitSize-2-label']")
	public WebElement reviewFitRating;
	
	@FindBy(xpath="//input[@id='bv-text-field-additionalfield_WhatSizeWasPurchased_4']")
	public WebElement reviewSizePurchasedInput;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_FootwearathleticWhatActivityAreYouDoingInThisShoecleat']")
	public WebElement reviewActivityWithShoeDropdown;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_FootwearathleticWhatActivityAreYouDoingInThisShoecleat']//option")
	public List<WebElement> reviewActivityWithShoeOptions;
	
	public void reviewActivityWithShoeSelectOption(String optionText) {
		for(WebElement option: reviewActivityWithShoeOptions) {
			if(option.getText().equals(optionText)) {
				option.click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_FootwearathleticHowWouldYouRateComfortLevel']")
	public WebElement reviewRateComfortLevelDropdown;
	
	@FindBy(xpath="//select[@id='bv-select-field-contextdatavalue_FootwearathleticHowWouldYouRateComfortLevel']//option")
	public List<WebElement> reviewRateComfortLevelOptions;
	
	public void reviewRateComfortSelectLevel(String optionText) {
		for(WebElement option: reviewRateComfortLevelOptions) {
			if(option.getText().equals(optionText)) {
				reviewRateComfortLevelDropdown.click();
				commonMethods.doubleClick(option);
				//option.click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//input[@id='bv-text-field-additionalfield_FootwearathleticWhatCanWeDoBetterOrDifferentlyToImproveHowAShoecleatFits']")
	public WebElement reviewWhatCanWeDoToImproveShoeFitInput;
	
	@FindBy(xpath="//input[@id='bv-checkbox-reviews-termsAndConditions']")
	public WebElement reviewTermsAndConditionsCheckBox;
	
	@FindBy(xpath="//button[@class='bv-form-actions-submit bv-submit bv-focusable bv-submission-button-submit']")
	public WebElement postReviewButton;
	
	public void navigateToShadowRootURL() {
		BaseClass.getDriver().get("https://www.dickssportinggoods.com/p/nike-mens-metcon-9-training-shoes-23nikmmtcn9gryxxxprf"
				+ "/23nikmmtcn9gryxxxprf?color=Lt%20Smoke%20Grey%2FPhoton%20Dust");
	}
	

	public void getElementInShadow() { 
		 WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 60);
		 
		 wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		
		  try {
		 // Find the shadow host element
	    WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
	    		(".bv-qna__sc-2a9khn-1.ePCkTM"))); 

	    // Execute JavaScript to access the shadow DOM
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseClass.getDriver();
	    WebElement elementInShadow = (WebElement) jsExecutor.executeScript(
	    		 "return arguments[0].shadowRoot.querySelector('#bv-question-btn');", shadowHost);

	    // Check if the element is found
	    if (elementInShadow != null) {
	        System.out.println("Element within shadow DOM found: " + elementInShadow.getText());
	        // Now you can interact with the element as needed
	    } else {
	        System.out.println("Element within shadow DOM not found.");
	    }
		  } catch (TimeoutException e) {
		        System.out.println("Timeout waiting for shadow host element to be visible.");
		        e.printStackTrace();
}
	}	
		
	
}
