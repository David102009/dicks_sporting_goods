package testFaz;

import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;


//Verify navigation to "Contact us" page

public class HomePageFazTest extends CommonMethods{
	
	@Test
	public void verifyNavigationToContactUsPage() {
		CommonMethods.click(cu.contactUsButton);
		cu.checkTitleAccuracy(BaseClass.getMyProperty("expectedTitle"));
		
	}


}

