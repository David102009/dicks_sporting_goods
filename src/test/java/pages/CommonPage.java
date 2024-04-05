package pages;

import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
import utilities.commonMethods;

public class CommonPage {
	
	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
    }

	@FindBy(xpath="//a[@title='Services']")
	public WebElement selectServicesTab;
	
	@FindBy(xpath="//div[@class='topNavBar-container__text-container hmf-py-xs']/a")
	public List <WebElement> mainNavMenu;
	
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

	@FindBy(xpath="//div[@class='topNavBar-container__text-container hmf-py-xs']/a[2]")
	public List<WebElement> mainNavMenu2;
  
	@FindBy(xpath="//div[@class='my-account-text hmf-display-flex hmf-align-content-center']")
	public WebElement loginPageButton;
	
	@FindBy(xpath = "//*[@clip-path='url(#DSG_Logo_2024_svg__a)']")
	public WebElement homeButton;
	
	public void selectPickupAndDelivery() {
		BaseClass.getDriver().findElement(By.xpath("//div[@class='topNavBar-container__text-container hmf-py-xs']/a[2]")).click();
	}
	
	
	public void selectMainNavOption(String option) {
		for(WebElement eachOption : mainNavMenu) {
			if(eachOption.getText().equalsIgnoreCase(option)) {
				commonMethods.click(eachOption);
				break;
			}
		}
	}
	
}

