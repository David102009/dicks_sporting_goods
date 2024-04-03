package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PaolaMensAthleticAndSneakerPage {

	public PaolaMensAthleticAndSneakerPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@aria-label='adidas Originals Gazelle Shoes']")
	public WebElement addidasOriginalsGazelleShoesProduct;
	
	
}
