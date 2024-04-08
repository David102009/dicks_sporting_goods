package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class ContactUs {
    
    @FindBy(xpath = "//*[@class='dsg-react-button secondary']")
    public WebElement contactUsButton;
    
    @FindBy(xpath = "//*[@id=\"nebula_div_btn\"]/div[2]")
    public WebElement feedbackTab;

    @FindBy(xpath = "//*[@id=\"Returns\"]/div/a/div/p")
	public WebElement returnsIcon;
	
    @FindBy(xpath = "//*[@id=\"Billing\"]/div/a/div/p")
	public WebElement billingIcon;

    @FindBy(xpath = "//*[@id=\"ScoreCard\"]/div/a/div/p")
	public WebElement scorecardIcon;
	
    
    // Other page elements can be declared here
    
    public ContactUs() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void checkTitleAccuracy(String titleText) {
        String expectedTitle = "Dick's sporting goods help desk and Online chat";
        if (titleText.toLowerCase().contains(expectedTitle.toLowerCase())) {
            System.out.println("Title is present: " + titleText);
        } else {
            System.out.println("Title is not present.");
        }
    }

    public void clickFeedbackTab() {
        feedbackTab.click();
    }

	public boolean isFeedbackFormDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}