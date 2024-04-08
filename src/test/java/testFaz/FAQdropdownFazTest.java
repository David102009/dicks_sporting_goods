package testFaz;


	import org.testng.annotations.Test;
	import utilities.BaseClass;
	import utilities.commonMethods;

	public class FAQdropdownFazTest extends commonMethods {
		
	    
	    @Test
	    public void verifyFAQDropdownFunctionality() {
	        // Navigate to Contact Us page
	        commonMethods.click(cu.contactUsButton);
	        
	        // Click on the feedback tab to open the feedback
	        commonMethods.click(cu.feedbackTab);
	        
	        // Click on each radio button option to select it
	        commonMethods.click(cu.radioButtonOption1);
	        // Verify that selecting a new radio button deselects the previously selected one
	        commonMethods.verifyRadioButtonSelection(cu.radioButtonOption1);
	        
	        commonMethods.click(cu.radioButtonOption2);
	        commonMethods.verifyRadioButtonSelection(cu.radioButtonOption2);
	        
	        // Add more radio button options if needed and repeat the above steps
	        
	    }
	}
