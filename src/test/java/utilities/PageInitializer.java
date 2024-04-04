package utilities;

import pages.ShoesPage;
import pages.SplashPage;

public class PageInitializer extends BaseClass{

	
	
	public static ShoesPage shoesPage;
	public static SplashPage splashPage;
	
	public static void initialize() {
	
		shoesPage = new ShoesPage();
		splashPage = new SplashPage();
		
	}
}
