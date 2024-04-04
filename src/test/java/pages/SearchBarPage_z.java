package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.BaseClass;

public class SearchBarPage_z {

	public SearchBarPage_z() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	public WebElement searchBar;

	@FindBy(xpath = "//*[@class='dsg-search-result-products']")
	public List<WebElement> ListOfDropDownItems;

	@FindBy(xpath = "//*[@class=\"dsg-forward-logo\"]")
	public WebElement searchButton;


	public List<String> collectDropdownItemTexts() {
		List<String> itemTexts = new ArrayList<>();
		for (WebElement item : ListOfDropDownItems) {
			String text = item.getText();
			if (!text.isEmpty()) {
				itemTexts.add(text);
			}
		}
		return itemTexts;
	}


	public void verifySearchURL(WebDriver driver, String searchTerm) {

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("searchTerm=" + searchTerm)) {
			System.out.println("The search results page is correct.");
		} else {
			System.out.println("The page is not the correct page.");

		}
	}

	public void collectAndPrintDropdownItemTexts() {
		List<String> itemTexts = collectDropdownItemTexts();
		System.out.println("Dropdown Items:");
		for (String text : itemTexts) {
			System.out.println(text);
		}
	}

	public void assertDropdownItemsRelevantToSearch1(List<String> dropdownItems, String searchTerm) {
		for (String item : dropdownItems) {
			Assert.assertTrue(item.contains(searchTerm),
					"Dropdown item " + item + " does not contain the search term " + searchTerm);
		}
	}
}
