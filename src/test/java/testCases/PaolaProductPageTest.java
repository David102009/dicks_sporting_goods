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
		
	}
	
	
	
	
	
	
}
