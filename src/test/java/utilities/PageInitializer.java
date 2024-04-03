package utilities;

import pages.CommonPage;
import pages.PaolaMensAthleticAndSneakerPage;
import pages.PaolaProductPage;
import pages.PaolaWomensLeggingsPage;

public class PageInitializer extends BaseClass{

	public static CommonPage cP;
	public static PaolaProductPage pP;
	public static PaolaMensAthleticAndSneakerPage maasP;
	public static PaolaWomensLeggingsPage wlP;
	
	public static void initialize() {
		cP = new CommonPage();
		pP = new PaolaProductPage();
		maasP = new PaolaMensAthleticAndSneakerPage();
		wlP = new PaolaWomensLeggingsPage();
	}
	
	
	
}
