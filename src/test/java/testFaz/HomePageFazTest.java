package testFaz;

import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

//Verify navigation to "Contact us" page

public class HomePageFazTest extends commonMethods{
	
	@Test
	public void verifyNavigationToContactUsPage() {
		commonMethods.click(cu.contactUsButton);
		cu.checkTitleAccuracy(BaseClass.getMyProperty("expectedTitle"));
		
	}


}

