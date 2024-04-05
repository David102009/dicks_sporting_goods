package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.commonMethods;

public class PickupAndDeliveryPage {
	
	public PickupAndDeliveryPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	

	
	@FindBy(xpath="//a[@class='item-cta cmp-button']")
	public List <WebElement> deliveryOptions;
	
	
	public void selectCurbsideOption() {
        int optionIndex = 4; // Index starts from 0
        
        // Check if the list has at least 5 options
        if (deliveryOptions.size() >= 5) {
            // Enhanced for loop to iterate through each WebElement
            for (int i = 0; i < deliveryOptions.size(); i++) {
                WebElement option = deliveryOptions.get(i);
                if (i == optionIndex) {
                    // Perform action on the fifth option (index 4)
                    option.click(); // For example, click on the option
                    break; // Break the loop once the fifth option is selected
                }
            }
        } else {
            System.out.println("There are not enough options to select the fifth one.");
        }
    }

}
