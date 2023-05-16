package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public static WebDriver driver;

	public WebDriver init_drivers(String browser) {

		System.out.println("Browser used is : " + browser);
		if (browser.equalsIgnoreCase("Chrome")) {
			//ChromeOptions co=new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please pass correct browser value :"+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void closeDriver() {
		driver.close();
		//driver.quit();
		
	}
	
}