package testcases;

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
		Assert.assertEquals(BaseClass.getProperty("confirmationText"), fYP.confirmationText().getText());
		System.out.println((fYP.confirmationText().getText()));
	}
}