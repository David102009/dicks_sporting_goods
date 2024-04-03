package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;
public class ogResetPsswd extends commonMethods {
	@Test
	public void resetPassword(){
		commonMethods.click(cP.loginPageButton);
		commonMethods.click(fYP.forgotPwd2());
		commonMethods.sendKeyDynamically(BaseClass.getProperty("email"), cAP.createAccEmail);
		commonMethods.click(fYP.continueButton());
		Assert.assertTrue(fYP.confirmationText().getText().contains("for instructions to reset your password."));
		System.out.println((fYP.confirmationText().getText()));
	}
}