package testFaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.PageInitializer;



public class RadioButtonFazTest extends BaseClass {

    @Test(description = "Verify Feedback Tab and Radio button functionality")
    public void verifyFeedbackTabAndRadioButtons() {
        // Initialize driver and navigate to Contact Us page
        initializeDriver();
        PageInitializer.initialize();

        // Click on the feedback tab
        PageInitializer.cu.clickFeedbackTab();

        // Verify feedback tab is opened
        Assert.assertTrue(PageInitializer.cu.isFeedbackFormDisplayed(), "Feedback form is not displayed.");

        // Click on each radio button and verify selection
        WebElement radioOption1 = driver.findElement(By.id("radioOption1"));
        WebElement radioOption2 = driver.findElement(By.id("radioOption2"));
        WebElement radioOption3 = driver.findElement(By.id("radioOption3"));

        // Click on the first radio button
        radioOption1.click();
        Assert.assertTrue(radioOption1.isSelected(), "Radio Option 1 is not selected.");

        // Click on the second radio button
        radioOption2.click();
        Assert.assertTrue(radioOption2.isSelected(), "Radio Option 2 is not selected.");
        Assert.assertFalse(radioOption1.isSelected(), "Radio Option 1 is still selected.");

        // Click on the third radio button
        radioOption3.click();
        Assert.assertTrue(radioOption3.isSelected(), "Radio Option 3 is not selected.");
        Assert.assertFalse(radioOption1.isSelected(), "Radio Option 1 is still selected.");
        Assert.assertFalse(radioOption2.isSelected(), "Radio Option 2 is still selected.");

        // Close the browser
        tearDown();
    }
}