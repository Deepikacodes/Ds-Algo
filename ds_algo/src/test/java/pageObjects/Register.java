package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;

public class Register {
	private WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	String RegisterUrl=ConfigReader.getRegisterUrl();
	//constructor 
		public Register(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this); // initializing WebElelements
		}
	//Username 
		@FindBy(xpath = "//input[@id='id_username']") WebElement userName;
		
	//Password
		@FindBy(name = "password1") WebElement password;
		
	//Password Confirmation
		@FindBy(name="password2") WebElement passcfrm;
		
	//Register button
		@FindBy(xpath = "//input[@type='submit']") WebElement registerBtn;
		
	//Register link
		@FindBy(xpath = "//a[text()=' Register ']") WebElement registerLink;
		
	//Login link
		@FindBy(xpath = "//a[text()='Login ']") WebElement loginLink;
		
	//SignIn link
		@FindBy(linkText = "Sign in") WebElement signIn;
	
	//Password Mismatch error message
		@FindBy(xpath="//div[@class='alert alert-primary']") WebElement mismatchError;
	
	//New account created label
		@FindBy(xpath = "//div[@role='alert']") WebElement newAccountmsg;
		
		//Actions
		
		public void clickRegisterLink() {
			registerLink.click();
		}
		public void navigateToRegister() {
			driver.get(RegisterUrl);
		}
		
		public String getRegisterTitle()  {
			return driver.getTitle().trim();
		}
		
		public void clickLoginLink() throws Exception {
			Thread.sleep(1000);
			loginLink.click();
		}
		
		public String loginTitle() {
			return driver.getTitle().trim();
		}
		
		public void clickRegisterBtn() {
			registerBtn.click();
		}
		
		public Boolean getEmptyUser() {
			boolean isRequired = false;
			//Validation msgs are generated because input fields have 'required' attribute turned on
			//Validation error will pop up if the field is empty
			if (userName.getText().isBlank()) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				isRequired = (Boolean) js.executeScript("return arguments[0].required;", userName);
			}
			return isRequired;
		}
		
		public String getEmptyUserPopUp() throws Exception {
		       Thread.sleep(1000);
			return userName.getAttribute("validationMessage");
		}
		
		public Boolean getEmptyPassword() {
			boolean isRequired = false;
			//Validation msgs are generated because input fields have 'required' attribute turned on
			//Validation error will pop up if the field is empty
			if (password.getText().isBlank()) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				isRequired = (Boolean) js.executeScript("return arguments[0].required;", password);
			}
			return isRequired;
		}
		
		public String getEmptyPwdPopUp() throws Exception {
		       Thread.sleep(1000);
			return password.getAttribute("validationMessage");
		}
		
		public void  enterUserName(String Username) {
			userName.clear();
			userName.sendKeys(Username);
		}
		public Boolean getEmptyPasswordCfm() {
			boolean isRequired = false;
			//Validation msgs are generated because input fields have 'required' attribute turned on
			//Validation error will pop up if the field is empty
			if (passcfrm.getText().isBlank()) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				isRequired = (Boolean) js.executeScript("return arguments[0].required;", passcfrm);
			}
			return isRequired;
		}
		public String getEmptyPwdCfmPopUp() throws Exception {
		       Thread.sleep(1000);
			return passcfrm.getAttribute("validationMessage");
		}
		public void  enterUsrPass(String Username,String Password) {
			userName.clear();
			userName.sendKeys(Username);
			password.clear();
			password.sendKeys(Password);
		}
		
		public void  enterPassPassCfm(String Password,String PassCfm) {
			password.clear();
			password.sendKeys(Password);
			passcfrm.clear();
			passcfrm.sendKeys(PassCfm);
			
		}
		public void  enterAllFields(String Username,String Password,String PasswordCfm) {
			userName.clear();
			userName.sendKeys(Username);
			password.clear();
			password.sendKeys(Password);
		}
		
		public void enterPassmismatch(String Username,String Password,String pwdCfm) {
			userName.clear();
			userName.sendKeys(Username);
			password.clear();
			password.sendKeys(Password);
			passcfrm.clear();
			passcfrm.sendKeys(pwdCfm);
		}
		
		public String getNewAccountCreatedText() throws Exception {
			Thread.sleep(2000);
			return newAccountmsg.getText();
		}
          
		//username
		public void enterValidUsername(DataTable dataTable) {
			List<Map<String, String>> userCred = dataTable.asMaps(String.class, String.class);
			for (Map<String, String> mapData : userCred) {
				String user = mapData.get("Username");
				userName.clear();
				userName.sendKeys(user);
			}
		}
		//password
		public void enterValidPassword(DataTable dataTable) throws InterruptedException {
			List<Map<String, String>> userCred = dataTable.asMaps(String.class, String.class);
			for (Map<String, String> mapData : userCred) {
				String pwd = mapData.get("Password");
				password.clear();
				Thread.sleep(1000);
				password.sendKeys(pwd);
			}
		}
		
		//password confirmation
		public void enterValidPasswordCfm(DataTable dataTable) throws InterruptedException {
			List<Map<String, String>> userCred = dataTable.asMaps(String.class, String.class);
			for (Map<String, String> mapData : userCred) {
				String pwdCfm = mapData.get("Password confirmation");
				passcfrm.clear();
				Thread.sleep(1000);
				passcfrm.sendKeys(pwdCfm);
			}
		}
		
		public String getPwdMismatchMsg() throws Exception {
			 Thread.sleep(1000);
			return mismatchError.getText();
		}
}

