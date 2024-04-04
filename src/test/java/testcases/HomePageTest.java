package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class HomePageTest extends commonMethods {
	
	@Test			//Testcase1
	public void redirectToSneakerReleaseCalendar() {
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption1"));
		commonMethods.SMALL_WAIT();
		sRCP.selectHomeButton.click();
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption1"));
	}
	
	@Test				//@Testcase2
	public void ItemsShouldDisplayLatestDateInSneakerCalendar() {
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption1"));
		commonMethods.scrollToElement(sRCP.upcomingBar);
		sRCP.popUpWindow.click();
		Assert.assertTrue(sRCP.dayElement.getText().contains("06"));//		
//		sRCP.isTodayOrLaterDatePresent();
	}
	
	
	
	
	@Test			//Testcase3
	public void setReminderForGoogleCalendar() {
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption1"));
		commonMethods.SMALL_WAIT();
		commonMethods.scrollToElement(sRCP.setReminderButton.get(0));
		commonMethods.click(sRCP.setReminderButton.get(3));
		commonMethods.SMALL_WAIT();
		commonMethods.click(sRCP.selectGoogleButton.get(1));
		

}
	@Test   		//Testcase4
	public void reviewReturnPolicy() {
//		cP.selectPickupAndDelivery();
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption2"));
		commonMethods.MEDIUM_WAIT();
		pAD.selectCurbsideOption();
		commonMethods.scrollToElement(rE.returnPolicySection);
		Assert.assertTrue(rE.returnPolicySection.isDisplayed());
		commonMethods.takeScreenShot(getDriver());
		commonMethods.SMALL_WAIT();
	}
	
					//Testcase5
	@Test
	public void viewTheRepairList() {
		cP.selectMainNavOption(BaseClass.getProperty("mainNavOption3"));
		commonMethods.SMALL_WAIT();
		sP.BikeGear.click();
		commonMethods.takeScreenShot(getDriver());
		
	}
	
	
	
}