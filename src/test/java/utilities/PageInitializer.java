package utilities;

import pages.CommonPage;
import pages.PaolaMensAthleticAndSneakerPage;
import pages.PaolaProductPage;
import pages.PaolaWomensLeggingsPage;
import pages.GoogleCalendarPage;
import pages.PickupAndDeliveryPage;
import pages.ReturnsAndExchangesPage;
import pages.ServicesPage;
import pages.SneakerReleaseCalendarPage;
import pages.cartPage;
import pages.createAccountPage;
import pages.forgotYourPasswordPage;

public class PageInitializer extends BaseClass{


	public static PaolaProductPage pP;
	public static PaolaMensAthleticAndSneakerPage maasP;
	public static PaolaWomensLeggingsPage wlP;
	public static SneakerReleaseCalendarPage sRCP;
	public static GoogleCalendarPage gCP;
	public static PickupAndDeliveryPage pAD;
	public static ReturnsAndExchangesPage rE;
	public static ServicesPage sP;
  public static CommonPage cP ;
	public static createAccountPage cAP ;
	public static forgotYourPasswordPage fYP;
	public static cartPage cOP;
	
	public static void initialize() {
		cP = new CommonPage();
		pP = new PaolaProductPage();
		maasP = new PaolaMensAthleticAndSneakerPage();
		wlP = new PaolaWomensLeggingsPage();
		sRCP = new SneakerReleaseCalendarPage();
		gCP = new GoogleCalendarPage();
		pAD = new PickupAndDeliveryPage();
		rE = new ReturnsAndExchangesPage();
		sP = new ServicesPage();
		cAP = new createAccountPage();
		fYP = new forgotYourPasswordPage();
		cOP = new cartPage();
  }


}