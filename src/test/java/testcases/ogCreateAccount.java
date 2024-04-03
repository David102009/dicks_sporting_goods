package testcases;

import org.bouncycastle.util.Properties;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class ogCreateAccount extends commonMethods{

	@Test
	public void creatingAccount() {
		commonMethods.click(cP.loginPageButton);
		commonMethods.click(cAP.joinNow);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), cAP.createAccEmail);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("password"), cAP.createAccPassword);
		commonMethods.click(cAP.joinNowButton);
		commonMethods.click(cAP.saveProfile);
		commonMethods.click(cAP.homeButton);
	}
}
