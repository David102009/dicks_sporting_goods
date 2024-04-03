package testcases;

import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;
public class ogLoginTest extends commonMethods {
	@Test
	public void loginSuccessful() {
		commonMethods.click(cP.loginPageButton);
		commonMethods.TINY_WAIT();
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), cAP.createAccEmail);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("password"), cAP.createAccPassword);
		commonMethods.click(cAP.signInButton);
	    System.out.println("You are on the  " + BaseClass.getDriver().getTitle() +  " page.");
	}
}