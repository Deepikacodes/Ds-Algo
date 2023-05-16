package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import driverManager.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.SignIn;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.ExcelReader;

public class SignIn_SD {

	SignIn sign=new SignIn(DriverFactory.getDriver());
	
	String Excelpath=ConfigReader.getExcelFilePath();
	
	String username;
	String password;
	String message;
	Boolean isRequired;
	
	
	
	//@login_tc1
//	@Given("User launches the ds-algo portal link")
//	public void user_launches_the_ds_algo_portal_link() {
//	   sign.launchApp();
//	}
//	@When("User clicks the Get Started button")
//	public void user_clicks_the_get_started_button() {
//	   sign.clickGetStartedBtn();
//	}
//	@When("Clicks on the Sign in link in HomePage")
//	public void clicks_on_the_sign_in_link_in_home_page() {
//	  sign.clickSignIn();
//	}
//	@Then("User is successfully navigated to the login page")
//	public void user_is_successfully_navigated_to_the_login_page() {
//		String actual=sign.getPageTitle();
//		Assert.assertEquals(actual,"Login");
//		LoggerLoad.info("Title of the current page :"+actual);
//	}
     
	//@login_tc2
	@Given("User launches the Login page")
	public void user_launches_the_login_page() {
	    sign.launchLoginPage();
	}
	@When("User enters credentials  with {string} and {int}")
	public void user_enters_credentials_with_and(String Sheetname, Integer RowNumber) 
			throws InvalidFormatException, IOException {
		
		 ExcelReader reader=new ExcelReader();
		   List<Map<String, String>> testdata=reader.getData(Excelpath, Sheetname);
		  username = testdata.get(RowNumber).get("Username");
		  password = testdata.get(RowNumber).get("Password");
		  message = testdata.get(RowNumber).get("Message");
		 
		 if (username!= null || password != null)
		 sign.enterUserDetails(username, password);
		 LoggerLoad.info("Username entered:"+username+" Password entered :"+password);
		 LoggerLoad.info("The Expected message in data sheet :"+message);
	}
	
	@Then("Clicks on Login button and should appropriate alert message")
	public void clicks_on_login_button_and_should_appropriate_alert_message() throws InterruptedException {
	  String msg= sign.clickLogin();
	  Assert.assertEquals(msg, message);
	  LoggerLoad.info("The actual alert message:"+msg);
	}
	
	//@login_tc3
	@When("User enters credentials with empty {string} or {string} field")
	public void user_enters_credentials_with_empty_or_field(String username, String password) {
		LoggerLoad.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\" ");
		isRequired = sign.enterUserDetails(username, password);
		assertTrue(isRequired);
	    
	}
	@When("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
          sign.clickLoginBtn();
	}
	
   //@login_tc4
	@When("User enters valid Username {string} and Password {string}")
	public void user_enters_valid_username_and_password(String user, String pwd) throws InterruptedException {
	    sign.enterUserDetails(user, pwd);
	    sign.clickLoginBtn();
	}
	
	@When("Clicks on Signout  link")
	public void clicks_on_signout_link() throws Exception {
	  sign.signOut();
	}
	@Then("user should be logged out successfully with message {string}")
	public void user_should_be_logged_out_successfully_with_message(String expMsg) {
		String actual= sign.getAlertMsg();
		   Assert.assertEquals(actual, expMsg);
		   LoggerLoad.info("Successfully signout out with message "+actual);
	}




}