package stepDefinitions;

import java.util.List;
import org.testng.Assert;
import driverManager.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.DataStructures;
import utilities.LoggerLoad;

public class DataStructures_SD {
	
	DataStructures ds=new DataStructures(DriverFactory.getDriver());
	
	@Given("User enters valid username {string}, password {string} and clicks on Login button")
	public void user_enters_valid_username_password_and_clicks_on_login_button(String user, String pwd) {
	    ds.enterUserPwd(user, pwd);
	    ds.clickLogin();
	    LoggerLoad.info("User enters valid credentials and clicks login button");
	}
	
	
	@When("User clicks on the {string} button in the Data Structures panel")
	public void user_clicks_on_the_button_in_the_data_structures_panel(String string) {
	   ds.getStarted_DS();
	}
	@Then("User is navigated to Data Structures Introduction page")
	public void user_is_navigated_to_data_structures_introduction_page() {
		LoggerLoad.info("User is redirected to Data Structures Introduction page");
		String title=ds.getPageTitle();
		Assert.assertEquals(title, "Data Structures-Introduction");
		LoggerLoad.info("The current page title is :"+title);
	   
	}
	
	@When("User clicks on the Time Complexity link")
	public void user_clicks_on_the_time_complexity_link() throws Exception {
	    ds.clickOnTimeComplexitylink();
	}
	@Then("User is navigated to the Time Complexity page")
	public void user_is_navigated_to_the_time_complexity_page() {
	    String current=ds.getPageTitle();
	    Assert.assertEquals(current, "Time Complexity");
	    LoggerLoad.info("The page title of current page is :"+current);
	}
	@When("User clicks on  the Try here button")
	public void user_clicks_on_the_try_here_button() throws Exception {
	    ds.clickTryHereBtn();
	    LoggerLoad.info("Clicking on Try here button in Data Structure introduction page");
	}
	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String expTitle) {
	    String actual=ds.getPageTitle();
	    Assert.assertEquals(actual, expTitle);
	    LoggerLoad.info("The title of current page :"+actual);
	}
	@When("User enters valid python code")
	public void user_enters_valid_python_code(DataTable pythonCode) {
		 List<List<String>>data=pythonCode.cells();
		 ds.entercode(data.get(0).get(0));
	LoggerLoad.info("Entering valid python code from datatable");
	}
	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
	    ds.clickRunBtn();
	    LoggerLoad.info("Clicking on the run button");
	}
	@Then("User should see the valid output")
	public void user_should_see_the_valid_output() {
		String output=ds.validateOutput();
	    Assert.assertEquals(output, "Data Structures Introduction Module");
	    LoggerLoad.info("The output displayed :"+output);
	}


}
