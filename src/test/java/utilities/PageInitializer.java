package utilities;

import pages.DeliveryPage_z;
import pages.HomePage_z;
import pages.StorePage_z;
import pages.SearchBarPage_z;
import pages.ShoesPage;
import pages.SplashPage;
import pages.CommonPage;
import pages.GoogleCalendarPage;
import pages.PaolaMensAthleticAndSneakerPage;
import pages.PaolaMensCrossTrainingShoesPage;
import pages.PaolaProductPage;
import pages.PaolaWomensLeggingsPage;
import pages.PickupAndDeliveryPage;
import pages.ReturnsAndExchangesPage;
import pages.ServicesPage;
import pages.SneakerReleaseCalendarPage;
import pages.cartPage;
import pages.createAccountPage;
import pages.forgotYourPasswordPage;
import pages.logOutPage;

public class PageInitializer extends BaseClass{

	public static PaolaProductPage pP;
	public static PaolaMensAthleticAndSneakerPage maasP;
	public static PaolaWomensLeggingsPage wlP;
	public static SneakerReleaseCalendarPage sRCP;
	public static GoogleCalendarPage gCP;
	public static PickupAndDeliveryPage pAD;
	public static ReturnsAndExchangesPage rE;
	public static ServicesPage sP;
 public static CommonPage cP;
	public static createAccountPage cAP ;
	public static forgotYourPasswordPage fYP;
	public static cartPage cOP;
	public static PaolaMensCrossTrainingShoesPage mcsP;
	public static ShoesPage shoesPage;
	public static SplashPage splashPage;
	public static logOutPage lOP;
  public static HomePage_z hpZ;
	public static StorePage_z spZ;
	public static SearchBarPage_z sbZ;
	public static DeliveryPage_z dpZ;
	public static void initialize() {
    shoesPage = new ShoesPage();
		splashPage = new SplashPage();
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
		mcsP = new  PaolaMensCrossTrainingShoesPage();
		lOP = new logOutPage();
		hpZ = new HomePage_z();
		spZ = new StorePage_z();
		sbZ = new SearchBarPage_z();
		dpZ = new DeliveryPage_z();
  }

}

