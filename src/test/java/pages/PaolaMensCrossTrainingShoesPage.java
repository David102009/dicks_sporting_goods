package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaolaMensCrossTrainingShoesPage {

	public PaolaMensCrossTrainingShoesPage() {
		
	}
	
	@FindBy(xpath="//div[@class='rs-sort-opn-close-icon']")
	public WebElement sortDropDownButton;
	
	@FindBy(xpath="//div[contains(text(),'Top Sellers')]")
	public WebElement sortDropDownTopSellerSelection;
	
	@FindBy(xpath="//*[@alt=\"Nike Men's Metcon 9 Training Shoes\"]")
	public WebElement nikeMetcon9Shoes;
	
	@FindBy(xpath="/html/body/link[1]")
	public WebElement askAQuestionButton;
	
	
}
