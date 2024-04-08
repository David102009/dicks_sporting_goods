package testFaz;

import org.testng.annotations.Test;

import utilities.CommonMethods;


public class ContactPageServiceIconsFazTest extends CommonMethods {
@Test
    public void verifyContactPageServiceIcon() {
    CommonMethods.click(cu.contactUsButton);
    

    }
 
@Test
public void verifyNavigationToReturnsIcon() {
  CommonMethods.click(cu.returnsIcon);
  CommonMethods.verifyPageTitle("Returns and Exchanges");
}
  @Test
       public void verifyNavigationToBillingIcon() {
        CommonMethods.click(cu.billingIcon);
        CommonMethods.verifyPageTitle("PAYMENT OPTIONS-CREDIT CARDS & MORE");
  }
        
        @Test
        public void verifyNavigationToScorecardIcon() {
        CommonMethods.click(cu.scorecardIcon);
CommonMethods.verifyPageTitle("SCORECARD & SCOREREWARDS CREDIT CARD BENEFITS");
    }
@Test

public void verifyNavigationToReturnsPage1() {
    // Step 1: Click "Returns" icon
    CommonMethods.click(cu.returnsIcon);
    // Step 2: Verify navigation to Returns page and confirm page title
    CommonMethods.verifyPageTitle("Returns and Exchanges");
}
}