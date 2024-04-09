package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends PageInitializer {
	
	    public static void click1(WebElement element) {
	        waitForVisibility(element).click();
	    }

	    // New method to verify page title accuracy
	    public static void checkTitleAccuracy(String expectedTitle) {
	        String actualTitle = BaseClass.getDriver().getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
	    }

    public static void sendKey(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void paolaWait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyRadioButtonSelection(WebElement radioButton) {
        Assert.assertTrue(radioButton.isSelected(), "Radio button is not selected");
    }

    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String value) {
        String actualValue;
        for (WebElement eachElement : radioOrCheckbox) {
            actualValue = eachElement.getText();
            if (eachElement.isEnabled() && actualValue.equals(value)) {
                eachElement.click();
                break;
            }
        }
    }

    public static void selectDropDownByVisibleText(WebElement element, String textToSelect) {
        try {
            Select select = new Select(element);
            List<WebElement> options = select.getOptions();
            for (WebElement faz : options) {
                if (faz.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    // Alerts

    public static void acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = BaseClass.getDriver().switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    // Switch iframe

    public static void switchToIFrameByIndext(int iFrameIndex) {
        try {
            BaseClass.getDriver().switchTo().frame(iFrameIndex);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    // Switch to child window

    public static void switchToChildWindow(String currentWindow) {
        try {
            Set<String> windowHandles = BaseClass.getDriver().getWindowHandles();
            for (String handle : windowHandles) {
                if (!handle.equals(currentWindow)) {
                    BaseClass.getDriver().switchTo().window(handle);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while switching to child window " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Explicit Waits

    public static WebDriverWait getWaitObject() {
        return new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
    }

    public static WebElement waitForClickability(WebElement element) {
        return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForVisibility(WebElement element) {
        return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static void click(WebElement element) {
        waitForVisibility(element).click();
    }

    public static void sendKeyDynamically(String keys, WebElement element) {
        waitForVisibility(element).sendKeys(keys);
    }

    public static void hoverOverMouse(WebElement element) {
        Actions action = new Actions(BaseClass.getDriver());
        action.moveToElement(element).build().perform();
    }

    public static void dragAndDrop(WebElement source, WebElement target) {
        Actions action = new Actions(BaseClass.getDriver());
        action.dragAndDrop(source, target).build().perform();
    }

    public static void doubleClick(WebElement element) {
        Actions action = new Actions(BaseClass.getDriver());
        action.doubleClick(element).build().perform();
    }

    public static void takeScreenShot(WebDriver driver) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
            LocalDateTime now = LocalDateTime.now();
            String dateString = now.format(formatter);
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            String destFilePath = "src/test/resources/screenshots/eachScreenShot" + dateString + ".png";
            File destFile = new File(destFilePath);
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void verifyPageTitle(String expectedTitle) {
        String actualTitle = BaseClass.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
    }

}