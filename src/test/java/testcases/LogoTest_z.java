package testcases;

import org.testng.annotations.Test;

import utilities.commonMethods;

public class LogoTest_z extends commonMethods {

	// test1
	@Test()
	public void verifyLogoFunctionality() {

		hpZ.homePageLogo.click();
		commonMethods.TINY_WAIT();
		hpZ.assertAndPrintCurrentUrl();

	}

}

