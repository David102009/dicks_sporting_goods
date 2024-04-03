package pages;

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
	
	@FindBy(xpath="//a[@title='Services']")
	public WebElement selectServicesTab;
	
	@FindBy(xpath="//div[@class='topNavBar-container__text-container hmf-py-xs']/a")
	public List <WebElement> mainNavMenu;
	
	@FindBy(xpath="//div[@class='topNavBar-container__text-container hmf-py-xs']/a[2]")
	public List<WebElement> mainNavMenu2;
	
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
