package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CommonPage {
	
	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@data-em='TopNav_Men']")
	public WebElement menCatagory;
	
	@FindBy(xpath="//*[@data-em='TopNav_Men_Shoes_Athletic']")
	public WebElement athleticShoesMenCatagory;
	
	@FindBy(xpath= "//*[@data-em='TopNav_Men_Shoes_Training']")
	public WebElement trainingShoesMenCatagory;
	
	@FindBy(xpath="//*[@data-em='TopNav_Women']")
	public WebElement womenCatagory;
	
	@FindBy(xpath="//*[@data-em='TopNav_Women_Clothing_Leggings']")
	public WebElement leggingClothingWomenCatagory;
	
	
	
	

	
}
