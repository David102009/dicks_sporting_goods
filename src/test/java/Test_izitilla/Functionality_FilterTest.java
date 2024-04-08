package Test_izitilla;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class Functionality_FilterTest extends commonMethods{

	@Test         // test case 1
	public void filterSection() throws InterruptedException {
		//1.Navigate to search result page
		splashPage.enterSearchTermAndPressEnter(BaseClass.getProperty("searchWord"));
		//2.Click ‘Shoes’ category
		commonMethods.click(shoesPage.ShoesButton);
		//3.Scroll to ‘Gender’ section
		commonMethods.scrollToElement(shoesPage.GenderSection);
		//4.Click ‘Women’s’  check box 
		commonMethods.paolaWait(5);
		commonMethods.click(shoesPage.WomensCheckBox);
//		5.Click the ‘Brand’ search box
		commonMethods.paolaWait(1);
		commonMethods.clickByJS(shoesPage.BrandSerchBox);			
//		6.Input/ send keys ‘Nike’
		for(char ch : BaseClass.getProperty("brandSearchWord").toCharArray()) {
			shoesPage.BrandSerchBox.sendKeys(String.valueOf(ch));
			Thread.sleep(500);
		}
//		7.Click “Nike” check box
		commonMethods.click(shoesPage.nikeCheckBox);
//		8.Scroll to ‘Product Type’
		commonMethods.scrollToElement(shoesPage.ProductTypeText);
//		9.Click ‘Athletic & Sneakers’ check box
		commonMethods.clickByJS(shoesPage.AthleticAndSneakers);
		Assert.assertEquals(shoesPage.selectionTextForAthleticAndSneakers.getText(), "Product Type: Athletic & Sneakers");
//		10.Scroll to ‘Activity’ section
		commonMethods.scrollToElement(shoesPage.activityDropDown);
//		11.Click the ‘Activity’ drop down
		commonMethods.clickByJS(shoesPage.activityDropDown);
//		12.Click ‘Casual’ checkbox
		commonMethods.clickByJS(shoesPage.casualCheckBox);
		Assert.assertEquals(shoesPage.selectionTextForCasual.getText(),"Activity: Casual");
	}
	
	@Test     //test case2
	public void filterSectionPart2() {
//		1.Scroll to ‘Womens Shoe Size’ section
		splashPage.enterSearchTermAndPressEnter(BaseClass.getProperty("searchWord"));
		commonMethods.scrollToElement(shoesPage.womenShoeSizeDropDown);
//		2.Click ‘Womens Shoe Size’ drop down
		commonMethods.clickByJS(shoesPage.womenShoeSizeDropDown);
//		3.Click on the ‘Search Sizes’ search box
//		4.Input ‘6’
		commonMethods.sendKey(shoesPage.searchSizeCheckBox, BaseClass.getProperty("searchSize"));
//		5.Click on ‘6’ box
		commonMethods.clickByJS(shoesPage.womenShoesSize6);
		Assert.assertEquals(shoesPage.womenShoesSize6Text.getText(), "Womens Shoe Size: 6.0");
//		6.Scroll to ‘Shoe Width’ section
		commonMethods.scrollToElement(shoesPage.shoesWidthDropDown);
//		7.Click the ‘Shoe Width’ drop down
		commonMethods.clickByJS(shoesPage.shoesWidthDropDown);
//		8.Click ‘Medium’ check box
		commonMethods.clickByJS(shoesPage.mediumCheckBox);
		Assert.assertEquals(shoesPage.mediumText.getText(), "Shoe Width: Medium");
//		9.Scroll to ‘Color’ section
		commonMethods.scrollToElement(shoesPage.colorDropDown);
//		10.Click ‘Color’ drop down
		commonMethods.clickByJS(shoesPage.colorDropDown);
//		11.Click ‘Black” color option
		commonMethods.clickByJS(shoesPage.colorBlack);
		Assert.assertEquals(shoesPage.colorBlackText.getText(), "Color: Black");
//		12.Scroll to ‘Sale’ section
		commonMethods.scrollToElement(shoesPage.saleDropDown);
//		13.Click ‘Sale’ drop down
		commonMethods.clickByJS(shoesPage.saleDropDown);
//		14.Click the toggle switch button labeled ‘Sale’
		commonMethods.clickByJS(shoesPage.saleToggle);
		Assert.assertTrue(shoesPage.saleText.isDisplayed());
//		15.Scroll to ‘Price’ section
		commonMethods.scrollToElement(shoesPage.priceDropDown);
//		16.Click ‘Price’ drop down
		commonMethods.clickByJS(shoesPage.priceDropDown);
//		17.Click the ‘$50-$100’ check box
		commonMethods.clickByJS(shoesPage.price$50_$100);
		Assert.assertTrue(shoesPage.price$50_$100Text.isDisplayed());	
	}
	
	@Test     //test case 3
	public void sortByDropDown() {
//		Navigate to search result page
//		https://www.dickssportinggoods.com/search/SearchDisplay?searchTerm=shoes&storeId=15108&catalogId=12301&langId=-1&sType=SimpleSearch&resultCatEntryType=2&showResultsPage=true&fromPage=Search&searchSource=Q&pageView=&beginIndex=0&DSGsearchType=Keyword&pageSize=48&selectedStore=5202
		splashPage.enterSearchTermAndPressEnter(BaseClass.getProperty("searchWord"));
//		Sort drop down
//		1.Click on the ‘Sort By’ drop down
		commonMethods.clickByJS(shoesPage.sortDropDown);
//		2.Click ‘Top Sellers’
		commonMethods.clickByJS(shoesPage.topSellersButton);
//		Sort drop down High to Low vs Low to High		
//		3.Click on the ‘Sort By’ drop down
		commonMethods.clickByJS(shoesPage.sortDropDown);
//		4.Click ‘Price Low To High’
		commonMethods.clickByJS(shoesPage.lowToHigh);	
//		5.Make sure the first product on the page costs less than the last product on the page
		commonMethods.paolaWait(10);	
	    Assert.assertTrue(shoesPage.getPrice(shoesPage.lowToHighPrices.get(0)) <= shoesPage.getPrice(shoesPage.lowToHighPrices.get(shoesPage.lowToHighPrices.size() - 1)));
//		6.Click on the ‘Sort By’ drop down
	    commonMethods.clickByJS(shoesPage.sortDropDown);	
//		7.Click ‘Price Hight To Low’
		commonMethods.clickByJS(shoesPage.highToLow);	
//		8.Make sure the first product on the page costs more than the last product on the page
		commonMethods.paolaWait(10);
	    Assert.assertTrue(shoesPage.getPrice(shoesPage.highToLowPrices.get(0)) >= shoesPage.getPrice(shoesPage.highToLowPrices.get(shoesPage.highToLowPrices.size() - 1)));	
	}
	
	@Test    //Test case4
	public void shippingDeliverToSection2() {
//		Navigate to search result page
//		https://www.dickssportinggoods.com/search/SearchDisplay?searchTerm=shoes&storeId=15108&catalogId=12301&langId=-1&sType=SimpleSearch&resultCatEntryType=2&showResultsPage=true&fromPage=Search&searchSource=Q&pageView=&beginIndex=0&DSGsearchType=Keyword&pageSize=48&selectedStore=5202
		splashPage.enterSearchTermAndPressEnter(BaseClass.getProperty("searchWord"));
//		1.Next to ‘Shipping Deliver to” click the zip code
		shoesPage.selectANearByStore.click();
//		2.Wait for ‘Update Delivery Location’ container to load
//		3.Click the ‘Update’ text box
	    commonMethods.switchToIFrameByElement(shoesPage.iframeStoreLocationBox);
//		4.Delete the current zip code
//		5.Send keys ‘20109’ 
	    shoesPage.storeSearchBox.sendKeys(BaseClass.getProperty("zipCode"));
//		6.Click ‘Update’
	    shoesPage.storeSearchButton.click();		
//		7.Check that the ‘Shipping Deliver to’ zipcode has changed on the page
	    commonMethods.clickByJS(shoesPage.selectStore.get(0));
		String shippingTo = shoesPage.shippingTo.getText();
		System.out.println(shippingTo);
		Assert.assertEquals(shippingTo, "20109");		    
	}
	

	
	@Test       //test case 5
	public void selectedFiltersContainer() {
//		Navigate to search result page
//		https://www.dickssportinggoods.com/search/SearchDisplay?searchTerm=shoes&storeId=15108&catalogId=12301&langId=-1&sType=SimpleSearch&resultCatEntryType=2&showResultsPage=true&fromPage=Search&searchSource=Q&pageView=&beginIndex=0&DSGsearchType=Keyword&pageSize=48&selectedStore=5202
		splashPage.enterSearchTermAndPressEnter(BaseClass.getProperty("searchWord"));
//		1.In ‘Filters’ under ‘Categories’ click ‘Shoes’
		commonMethods.clickByJS(shoesPage.categoriesShoes);
//		2.Click ‘Same Day Delivery’ above the selected filters container
		commonMethods.clickByJS(shoesPage.sameDayDelivery);
//		3.Click the ‘X’ on the ‘Same Day Delivery’ filter chip to remove filter
		commonMethods.clickByJS(shoesPage.ExitFromSameDayDeliveryFilter);
//		4.Click the ‘X’ on the ‘Shoes’ filter chip to remove a filter
		shoesPage.shoesExitButton.click();
//		5.In ‘Filters’ under ‘Categories’ click ‘Shoes’
		commonMethods.clickByJS(shoesPage.categoriesShoes);
//		6.Click ‘Clear All’ button
		commonMethods.clickByJS(shoesPage.clearAllLink);
	//	shoesPage.clearAllLink.click();
	}
	

	
}// end of class
