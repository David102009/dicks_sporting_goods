package testFaz;

import org.testng.annotations.Test;
import pages.ContactUs;

import utilities.CommonMethods;

public class FAQdropdownFazTest extends CommonMethods {
    // Instantiate the ContactUs class
    private ContactUs cu = new ContactUs();
    
    @Test
    public void verifyFAQDropdownFunctionality() {
        // Navigate to Contact Us page
        cu.navigateToContactUsPage();
        
        // Click on the feedback tab to open the feedback
        cu.clickFeedbackTab();
        
        // Click on each radio button option to select it
        cu.clickRadioButtonOption1();
        // Verify that selecting a new radio button deselects the previously selected one
        cu.verifyRadioButtonSelection1(ContactUs.radioButtonOption1);
        
        cu.clickRadioButtonOption2();
        cu.verifyRadioButtonSelection1(ContactUs.radioButtonOption2);
    
    }
}