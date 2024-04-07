package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PaolaMensCrossTrainingShoesPage {

	public PaolaMensCrossTrainingShoesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='rs-sort-opn-close-icon']")
	public WebElement sortDropDownButton;
	
	@FindBy(xpath="//div[contains(text(),'Top Sellers')]")
	public WebElement sortDropDownTopSellerSelection;
	
	@FindBy(xpath="//div[@data-em='plp_1_3_23NIKMMTCN9GRYXXXPRF']//div[@class='card_image']")
	public WebElement nikeMetcon9Shoes;
	
	@FindBy(xpath="/html/body/link[1]")
	public WebElement askAQuestionButton;
	
}
