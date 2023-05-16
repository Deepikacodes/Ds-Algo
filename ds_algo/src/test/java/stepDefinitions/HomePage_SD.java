package stepDefinitions;

import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.LoggerLoad;

public class HomePage_SD {
	
	private HomePage homepage=new HomePage(DriverFactory.getDriver());
	
	//@home_tc1 @home_tc
	@Given("User launches ds-algo portal link")
	public void user_launches_ds_algo_portal_link() throws InterruptedException {
	    homepage.app_url();
	    LoggerLoad.info(" The user launches ds-algo portal link");
	}
	@When("User clicks on the Get Started button")
	public void user_clicks_on_the_get_started_button() throws InterruptedException {
	    homepage.getstarted_btn();
	    LoggerLoad.info("User clicks on the Get Started button ");
	}
	@Then("User should be redirected to HomePage")
	public void user_should_be_redirected_to_home_page() {
	    String title=homepage.getHomePageTitle();
	    Assert.assertEquals(title, "NumpyNinja");
	    LoggerLoad.info("Navigating to HomePage with title:"+title);
	}

	//@home_tc2 @home_tc
	@Given("User launches HomePage")
	public void user_launches_homepage() throws InterruptedException {
		homepage.homePage_url();
		LoggerLoad.info("HomePage is launched");
	}
	    
	@When("User clicks on Get Started button {string} on HomePage without login")
	public void user_clicks_on_get_started_button_on_home_page_without_login(String option) throws InterruptedException {
	   homepage.getStartedHome(option);
	   LoggerLoad.info("Click on all Get Started button in HomePage without login");
	}
	@Then("User should get warning message {string}")
	public void user_should_get_warning_message(String string) throws Exception  {
	    String msg=homepage.errorMsg();
	    Assert.assertEquals(msg,"You are not logged in");
	    LoggerLoad.info("Warning message :"+msg+" : is displayed");
	}
	
	//@home_tc3
	@When("User clicks on dropdown {string} without login")
	public void user_clicks_on_dropdown_without_login(String value) throws Exception {
	    homepage.dropdown(value);
	    LoggerLoad.info("Clicking on dropdown"+value+"without login");
	}
	
	//@home_tc4
	@When("User clicks on SignIn link")
	public void user_clicks_on_sign_in_link() throws InterruptedException {
	    homepage.signInLink();
	    LoggerLoad.info("Clicking on Sign in link");
	}
	@Then("User  should be  redirected to Login page")
	public void user_should_be_redirected_to_login_page()  {
		String title=homepage.getHomePageTitle();
		Assert.assertEquals(title, "Login");
		LoggerLoad.info("User is in Login page with title:"+title);
	}
	
	//@home_tc5
	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
          homepage.Register();
          LoggerLoad.info("Clicking on Register link");
	}
	@Then("User should be redirected to Register form")
	public void user_should_be_redirected_to_register_form() {
	    String registerTitle=homepage.registerTitle();
	    Assert.assertEquals(registerTitle, "Registration");
	    LoggerLoad.info("User is in Register page  with title:"+registerTitle);
	}
}
