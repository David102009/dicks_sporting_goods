package testFaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FeedbackTabFazTest {

    WebDriver driver; // Declare WebDriver instance as a class-level field

    @Test
    public void testFeedbackTabFunctionality() {
        // Initialize WebDriver
        driver = new ChromeDriver();

        // Navigate to the Help Center page
        driver.get("https://www.dickssportinggoods.com/s/help-center");

        // Locate FAQ dropdown element
        WebElement faqDropdown = driver.findElement(By.xpath("//select[@id='faqSelect']"));

        // Select an option from the FAQ dropdown
        Select faqDropdownSelect = new Select(faqDropdown);
        faqDropdownSelect.selectByVisibleText("Shipping & Delivery");

        // Verify if FAQ content is displayed
        WebElement faqContent = driver.findElement(By.xpath("//div[contains(@class,'faq-content')]"));
        boolean isContentDisplayed = faqContent.isDisplayed();

        // Print the result of the test
        if (isContentDisplayed) {
            System.out.println("FAQ dropdown functionality is working correctly.");
        } else {
            System.out.println("FAQ dropdown functionality is not working correctly.");
        }

        // Close the WebDriver instance
        driver.quit();
    }
}

