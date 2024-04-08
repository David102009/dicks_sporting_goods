package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.commonMethods;

public class PaolaProductPageTest extends commonMethods {

	@Test
	public void productColorSchemes() {
		commonMethods.click(cP.menCatagory);
		commonMethods.click(cP.athleticShoesMenCatagory);
		commonMethods.click(maasP.addidasOriginalsGazelleShoesProduct);
		commonMethods.click(pP.addidasGazelleShoeNavyTanColorSelection());
		Assert.assertTrue(pP.addidasGazelleShoeNavyTanLabel.getText().contains("Navy/Tan"));
	}
	
	@Test
	public void productSizing() {
		commonMethods.click(cP.womenCatagory);
		commonMethods.click(cP.leggingClothingWomenCatagory);
		commonMethods.click(wlP.fullLengthLeggingsOption);
		commonMethods.click(wlP.DSGWomenMomentumMeshTight);
		commonMethods.click(pP.DSGLeggingsPacificAzureColorSelection());
		commonMethods.click(pP.DSGLeggingsSizeMButton());
		Assert.assertTrue(pP.DSGLeggingsSizeLabel.getText().contains("M"));
		
		
	}

	@Test
	public void topicsAndReviewsSearchbar() {
		
	@Test  //element not found in shadow dom
	public void topicsAndReviewsSearchbar() {
		commonMethods.click(cP.menCatagory);
		commonMethods.scrollToElement(cP.trainingShoesMenCatagory);
		commonMethods.click(cP.trainingShoesMenCatagory);
		commonMethods.click(mcsP.sortDropDownButton);
		commonMethods.click(mcsP.sortDropDownTopSellerSelection);
		commonMethods.click(mcsP.nikeMetcon9Shoes);
		commonMethods.scrollToElement(pP.nikeMetConColors);
		commonMethods.scrollToElement(pP.nikeMetcon9ViewAllImagesButton);
		commonMethods.scrollToElement(pP.afterPayMessage);
		commonMethods.waitForVisibility(pP.poductInformationHeader);
		commonMethods.scrollToElement(pP.poductInformationHeader);
		commonMethods.scrollToElement(pP.productWebId);
		commonMethods.scrollToElement(pP.sponsoredHeader);
		commonMethods.scrollToElement(pP.NikeMetconWriteReviewButton());
		pP.navigateToShadowRootURL();
		pP.getElementInShadow();
	}
	
	@Test
	public void leaveAReview() {
		commonMethods.click(cP.menCatagory);
		commonMethods.scrollToElement(cP.trainingShoesMenCatagory);
		commonMethods.click(cP.trainingShoesMenCatagory);
		commonMethods.click(mcsP.sortDropDownButton);
		commonMethods.click(mcsP.sortDropDownTopSellerSelection);
		commonMethods.click(mcsP.nikeMetcon9Shoes);
		commonMethods.scrollToElement(pP.nikeMetConColors);
		commonMethods.scrollToElement(pP.nikeMetcon9ViewAllImagesButton);
		commonMethods.scrollToElement(pP.afterPayMessage);
		commonMethods.waitForVisibility(pP.poductInformationHeader);
		commonMethods.scrollToElement(pP.poductInformationHeader);
		commonMethods.scrollToElement(pP.productWebId);
		commonMethods.scrollToElement(pP.sponsoredHeader);
		commonMethods.click(pP.NikeMetconWriteReviewButton());
		Assert.assertTrue(pP.MyReviewForNikeMensMetcon9TrainingShoes.getText().contains
				("My Review for Nike Men's Metcon 9 Training Shoes"));
		commonMethods.click(pP.review5StarButton);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewTitle"), pP.reviewTitleInput);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewTextBox"), pP.reviewTextBox);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewNicknameInput"), pP.reviewNicknameInputBox);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), pP.reviewEmailInputBox);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewLocationInput"), pP.reviewLocationInputBox);
		commonMethods.scrollToElement(pP.reviewYourAgeSelect);
		commonMethods.click(pP.reviewYourAgeSelect);
		commonMethods.click(pP.reviewYourAgeDropdown1824Option);
		commonMethods.click(pP.reviewYourGenderSelect);
		commonMethods.click(pP.reviewYourGenderDropdownFemaleOption);
		commonMethods.click(pP.reviewPurchaseLocationSelect);
		pP.reviewPurchaseLocationDropdownSelectOptions("Online");
		commonMethods.click(pP.reviewValue5StarButton);
		commonMethods.click(pP.reviewQuality5StarButton);
		commonMethods.click(pP.reviewFitRating);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewSizePurchasedInput"), 
				pP.reviewSizePurchasedInput);
		commonMethods.click(pP.reviewActivityWithShoeDropdown);
		pP.reviewActivityWithShoeSelectOption("Game Day");
		commonMethods.selectDropDownByVisibleText(pP.reviewRateComfortLevelDropdown, "Comfortable");
		commonMethods.scrollToElement(pP.reviewWhatCanWeDoToImproveShoeFitInput);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("reviewWhatCanWeDoToImproveShoeFitInput"),
				pP.reviewWhatCanWeDoToImproveShoeFitInput);
		commonMethods.click(pP.reviewTermsAndConditionsCheckBox);
		commonMethods.click(pP.postReviewButton);

	}
	
}
