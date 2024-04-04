package utilities;

import pages.DeliveryPage_z;
import pages.HomePage_z;
import pages.StorePage_z;
import pages.SearchBarPage_z;

public class PageInitializer extends BaseClass{

	public static HomePage_z hpZ;
	public static StorePage_z spZ;
	public static SearchBarPage_z sbZ;
	public static DeliveryPage_z dpZ;
	
	public static void initialize() {
		
		hpZ = new HomePage_z();
		spZ = new StorePage_z();
		sbZ = new SearchBarPage_z();
		dpZ = new DeliveryPage_z();
		
		
	}
	
	
}
