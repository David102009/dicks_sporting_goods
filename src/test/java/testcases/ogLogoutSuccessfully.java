package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class ogLogoutSuccessfully extends commonMethods {
	
	@Test
	public void logoutAndConfirm() {
		commonMethods.click(cP.loginPageButton);
		commonMethods.click(cAP.joinNow);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), cAP.createAccEmail);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("password"), cAP.createAccPassword);
		commonMethods.TINY_WAIT();
		commonMethods.click(cAP.joinNowButton);
		commonMethods.click(cAP.saveProfile);
		commonMethods.click(lOP.signOutButton);
		Assert.assertEquals(BaseClass.getProperty("confirmSignout"), lOP.confirmSignedOut.getText());
		System.out.println("Logged out , confirmation text is  = " + lOP.confirmSignedOut.getText());
		
	}
	
}
