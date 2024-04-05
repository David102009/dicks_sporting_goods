package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PaolaWomensLeggingsPage {

	public PaolaWomensLeggingsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@alt='Full Length Leggings']")
	public WebElement fullLengthLeggingsOption;
	
	@FindBy(xpath="//div[@class=' dsg-flex flex-column rs_card_layout quickviewButton ']//img[@alt=\"DSG Women's Momentum Mesh Tight\"]")
	public WebElement DSGWomenMomentumMeshTight;
	
	
	
}
