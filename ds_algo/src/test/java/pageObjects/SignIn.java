package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.ElementsUtil;
import utilities.LoggerLoad;

public class SignIn {

	WebDriver driver;
	
	String Url=ConfigReader.getApplicationUrl();
	String signInUrl=ConfigReader.getSignInUrl();
	
	boolean isRequired;
	
	ElementsUtil util=new ElementsUtil();
	
	//Constructor
		public SignIn(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}
		@FindBy(xpath="//button[@class='btn']") WebElement getStartedBtn;
		
		@FindBy(xpath="//a[@href='/login']") WebElement signInLink;
		
        @FindBy(xpath= "//input[@name='username']") WebElement  userName;
		
		@FindBy(xpath = "//input[@name='password']") WebElement  passWord;
		
		@FindBy(xpath = "//input[@type='submit']") WebElement loginBtn;
		
		@FindBy(xpath="//div[@class='alert alert-primary']") WebElement alert;
		
		@FindBy(xpath="//a[text()='Sign out']") WebElement signoutLink;
		
		public void launchApp() {
			driver.get(Url);
			LoggerLoad.info("Launching the ds-algo portal");
		}
		
		public void launchLoginPage() {
			driver.get(signInUrl);
		}
		public void clickGetStartedBtn() {
			getStartedBtn.click();
		}
		
		public void clickSignIn() {
			util.waitForElement(signInLink);
			signInLink.click();
			LoggerLoad.info("Clicking the Sign in Link in Homepage");
		}
		
		public String getPageTitle() {
			return driver.getTitle().trim();
		}
		public Boolean enterUserDetails(String username, String password) {
            userName.clear();
			userName.sendKeys(username);
			passWord.clear();
			passWord.sendKeys(password);

			//Validation msgs are generated because input fields have 'required' attribute turned on
			//Validation error will pop up if the field is empty
			if (userName.getText().isBlank()) {
				JavascriptExecutor js_user = (JavascriptExecutor) driver;
				isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", userName);
				return isRequired;
			} else if (passWord.getText().isBlank()) {
				JavascriptExecutor js_password = (JavascriptExecutor) driver;
				isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", passWord);
				return isRequired;

			}
			return isRequired;
		}
		
		public String clickLogin() throws InterruptedException {
			Thread.sleep(1000);
			loginBtn.click();
			String msg = alert.getText();
			return msg;
		}
		
		public void clickLoginBtn() throws InterruptedException {
			Thread.sleep(1000);
			loginBtn.click();
		}
		
		
		public void signOut() throws Exception {
			Thread.sleep(1000);
			signoutLink.click();
		}
		
		public String getAlertMsg() {
			   String msg= alert.getText();
			   return msg;
			}
}
