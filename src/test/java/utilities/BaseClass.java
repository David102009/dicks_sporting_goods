package utilities;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// singleton class

	public static WebDriver driver;

	@BeforeMethod
	public static WebDriver getDriver() {

		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {

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
			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);
			PageInitializer.initialize();

		}

		return driver;
	}

	@AfterTest
	public static void teardDown() {
		if (BaseClass.getDriver() != null) {
			BaseClass.getDriver().close();
			BaseClass.getDriver().quit();
			driver = null;
		}
	}

	// declare properties file
	private static Properties configFile;

	// get 1stConfigFile.properties

	static {
		try {

			// config reader function
			String filePath = Constants.configProperty_filePath;
			// open a connection to a file
			FileInputStream inputStream = new FileInputStream(filePath);

			// initializing config file to a Properties data type
			configFile = new Properties();

			// load config file
			configFile.load(inputStream);
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
	
	
	private static Properties zuhraConfigFile;

	// get 1stConfigFile.properties

	static {
		try {

			// config reader function
			String filePath = Constants.zuhraconfigProperty_filePath;
			// open a connection to a file
			FileInputStream inputStream = new FileInputStream(filePath);

			// initializing config file to a Properties data type
			zuhraConfigFile = new Properties();

			// load config file
			zuhraConfigFile.load(inputStream);
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getMyProperty(String keyName) {
		return zuhraConfigFile.getProperty(keyName);
	}

//			

}
