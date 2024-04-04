package pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SplashPage {

	public SplashPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private List<WebElement> searchBoxes;
	
	public WebElement getVisibleSearchBox() {
		for(WebElement searchBox : searchBoxes) {
			if(searchBox.isDisplayed()) {
				return searchBox;
			}
		}
		throw new NoSuchElementException("No visible search box found.");
	}
	
	public void enterSearchTermAndPressEnter(String searchTerm) {
        WebElement visibleSearchBox = getVisibleSearchBox();
        if (visibleSearchBox != null) {
            visibleSearchBox.clear(); // Clear any pre-existing text
            visibleSearchBox.sendKeys(searchTerm + Keys.ENTER); // Enter the term and press Enter
        } else {
            throw new NoSuchElementException("No visible search box found.");
        }
    }
}
