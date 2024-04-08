package utilities;

import org.openqa.selenium.support.PageFactory;

import pages.ContactUs;

public class PageInitializer extends BaseClass{

	public static ContactUs cu;
	
	public static void initialize() {
	
	cu = new ContactUs ();
	 PageFactory.initElements(driver, cu);
	  
	
}
}
