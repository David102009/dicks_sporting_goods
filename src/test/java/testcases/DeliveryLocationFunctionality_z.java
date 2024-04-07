package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class DeliveryLocationFunctionality_z extends commonMethods {
//test4
	@Test
	public void VerifyDeliveryLocationFunctionality() {

		dpZ.deliveryButton.click();
		commonMethods.switchToIFrameByElement(dpZ.iframeDeliveryLocationBox);
		commonMethods.waitForClickability(dpZ.deliveryButton);
		dpZ.deliverySearchBox.clear();	
		dpZ.deliverySearchBox.sendKeys(BaseClass.getMyProperty("zipCode"));
		dpZ.deliveryUpdateButton.click();
		commonMethods.paolaWait(5);
		Assert.assertEquals(dpZ.changedDeliveryLocation.getText(), BaseClass.getMyProperty("zipCode"));
		
		
	}

}