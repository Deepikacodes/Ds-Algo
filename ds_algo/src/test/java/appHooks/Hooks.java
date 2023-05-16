package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import driverManager.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import java.io.ByteArrayInputStream;

public class Hooks {
	private static DriverFactory driverFactory;
	private static WebDriver driver;
	@SuppressWarnings("unused")
	private static ConfigReader configReader;
	Properties prop;

//	public void setup() {
//		//To get browser value from config.properties
//		//configReader = new ConfigReader();
//		prop = configReader.init_properties();
//		//String browserName = prop.getProperty("Browser");
//		String browser=ConfigReader.getBrowser();
//		// Driver is initialized from Driver Factory
//		driverFactory = new DriverFactory();
//		driverFactory.init_drivers(browserName);
//	}
	@BeforeAll
	public static void setup() {
		// To get browser value from config.properties
		configReader = new ConfigReader();
		ConfigReader.init_properties();
		String browser = ConfigReader.getBrowser();

		// Driver is initialized from Driver Factory
		driverFactory = new DriverFactory();
		driver = driverFactory.init_drivers(browser);
	}

	
	@AfterStep
	public void take_screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Taking Screenshot for failed steps");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "DsAlgo Screenshot");
			Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
		}
	}

	

	@AfterAll
	public static void tearDown() {
		DriverFactory.closeDriver();
	}
}
