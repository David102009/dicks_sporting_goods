package testcases;

import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;
public class ogLoginTest extends commonMethods {
	@Test
	public void loginSuccessful() {
		commonMethods.click(cP.loginPageButton);
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), cAP.createAccEmail);
		commonMethods.TINY_WAIT();
		commonMethods.sendKeyDynamically(BaseClass.getProperty("password"), cAP.createAccPassword);
		commonMethods.TINY_WAIT();
		commonMethods.click(cAP.signInButton);
		System.out.println("You are on the  " + BaseClass.getDriver().getTitle() +  " page.");
	}
}