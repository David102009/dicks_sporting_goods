package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethods;

public class SelectStoreTest extends commonMethods {
//test5
	@Test
	public void VerifySelectStoreFunctionality() {

		spZ.findAStoreButton.click();
		commonMethods.switchToIFrameByElement(spZ.iframeStoreLocationBox);
		spZ.storeSearchBox.sendKeys(BaseClass.getMyProperty("zipCode"));
		spZ.storeSearchButton.click();
		commonMethods.waitForVisibility(spZ.storeResults);
		spZ.selectFairfaxStore.click();
		commonMethods.paolaWait(3);
		Assert.assertEquals(spZ.getSelectedStoreTitle(), BaseClass.getMyProperty("expectedStoreName"));
		

	}
}
