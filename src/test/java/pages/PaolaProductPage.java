package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PaolaProductPage {

	public PaolaProductPage() {
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	
	public WebElement addidasGazelleShoeNavyTanColorSelection() {
		return BaseClass.getDriver().findElement(By.xpath("//*[@id='swatch_entitledItem_Navy_Tan_swatch']"));
	}
	
	@FindBy(xpath="//div[@class='color-container row ng-star-inserted']//*[@class='selected-attribute-title hmf-header-xs ng-star-inserted']")
	public WebElement addidasGazelleShoeNavyTanLabel;
	
	public WebElement DSGLeggingsPacificAzureColorSelection() {
		return BaseClass.getDriver().findElement(By.xpath("//*[@id='swatch_entitledItem_Pacific_Azure_swatch']"));
	}
	public WebElement DSGLeggingsSizeMButton() {
		return BaseClass.getDriver().findElement(By.xpath("//button[@class='btn-attr-select block-attr-block ng-star-inserted']//span[@id='block-swatch_Size_2']"));
		
	}
	
	@FindBy(xpath="//div[@id='attr_Size']//span[@class='selected-attribute-title hmf-header-xs ng-star-inserted']")
	public WebElement DSGLeggingsSizeLabel;
	
	
		
	
}
