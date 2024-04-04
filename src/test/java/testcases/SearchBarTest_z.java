package testcases;

import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class SearchBarTest_z extends commonMethods{
	
	//test2
	@Test
public void VerifySearchBarDropDownFunctionality() {
	
	sbZ.searchBar.click();
	commonMethods.sendKey(sbZ.searchBar, BaseClass.getMyProperty("searchItem"));
	commonMethods.paolaWait(5);
	List<String> dropdownItems = sbZ.collectDropdownItemTexts();
	sbZ.collectAndPrintDropdownItemTexts();
	sbZ.assertDropdownItemsRelevantToSearch1(dropdownItems, BaseClass.getMyProperty("searchItem"));
	
	}
	//test3
	@Test
	public void VerifySearchPageFunctionality() {
		
		sbZ.searchBar.click();;
		commonMethods.sendKey(sbZ.searchBar, BaseClass.getMyProperty("searchItem"));
		commonMethods.click(sbZ.searchButton);
		commonMethods.paolaWait(10);
		sbZ.verifySearchURL(getDriver(), BaseClass.getMyProperty("searchItem"));
					
		
	}
}
