package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    protected static WebDriver driver;
    
    public static WebDriver getDriver() {
    	return driver;
    	
    }

   
    public static void initializeDriver() {
            switch (getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
            }
            driver.get(getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);
            PageInitializer.initialize();
        }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    private static Properties configFile;
    private static Properties propertiesFaz;

    static {
        try {
            String configFilepath = Constants.configProperty_filePath;
            FileInputStream inputStream = new FileInputStream(configFilepath);
            configFile = new Properties();
            configFile.load(inputStream);
            inputStream.close();

            String fazFilePath = Constants.propertiesFazProperty_filePath;
            inputStream = new FileInputStream(fazFilePath);
            propertiesFaz = new Properties();
            propertiesFaz.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }

    public static String getMyProperty(String keyName) {
        return propertiesFaz.getProperty(keyName);
  
	}
}