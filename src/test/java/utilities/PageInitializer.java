package utilities;

import pages.CommonPage;
import pages.cartPage;
import pages.createAccountPage;
import pages.forgotYourPasswordPage;


public class PageInitializer extends BaseClass{
	public static CommonPage cP ;
	public static createAccountPage cAP ;
	public static forgotYourPasswordPage fYP;
	public static cartPage cOP;
	
	
	public static void initialize() {
		cP = new CommonPage();
		cAP = new createAccountPage();
		fYP = new forgotYourPasswordPage();
		cOP = new cartPage();
	}
}