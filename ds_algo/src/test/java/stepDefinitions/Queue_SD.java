package stepDefinitions;

import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.Queue;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Queue_SD {

	Queue queuepage = new Queue(DriverFactory.getDriver());
	String Excelpath=ConfigReader.getExcelFilePath();
	static String expectedMsg;
	
	@When("User clicks on the Get Started button inside Queue frame")
	public void user_clicks_on_the_get_started_button_inside_queue_frame() {
		queuepage.clk_QueueGetStarted();
	}
	@Then("User should be navigated to Queue home page")
	public void user_should_be_navigated_to_queue_home_page() {
		String expectedTitle = "Queue";
		String actualTitle = queuepage.get_QueueGetStarted_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("Title of the current page :"+actualTitle);
	}
	@When("User clicks on the Implementation of Queue in Python link")
	public void user_clicks_on_the_implementation_of_queue_in_python_link() {
		queuepage.clk_Imp_of_Queue_in_Python();
	}
	@Then("user should be navigated to Implementation of Queue in Python page")
	public void user_should_be_navigated_to_implementation_of_queue_in_python_page() {
		String expectedTitle = "Implementation of Queue in Python";
		String actualTitle = queuepage.get_Imp_of_Queue_in_Python_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("Title of the current page :"+actualTitle);
	}
	
	@When("User clicks on the Try Here button in queue")
	public void user_clicks_on_the_try_here_button_in_queue() {
	    queuepage.clickTryEditor();
	}
	
	@When("User clicks on the Implementation using collections.deque link")
	public void user_clicks_on_the_implementation_using_collections_deque_link() {
	    queuepage.clk_Imp_Using_Collections_in_Python();
	}
	@Then("user should be navigated to Implementation using collections.deque page")
	public void user_should_be_navigated_to_implementation_using_collections_deque_page() {
		String expectedTitle = "Implementation using collections.deque";
		String actualTitle = queuepage.get_Imp_Using_Collections_in_Python_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Implementation using array link")
	public void user_clicks_on_the_implementation_using_array_link() {
	    queuepage.clk_Imp_Using_Array();	    
	}
	@Then("user should be navigated to Implementation using array page")
	public void user_should_be_navigated_to_implementation_using_array_page() {
		String expectedTitle = "Implementation using array";
		String actualTitle = queuepage.get_Imp_Using_Array_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Queue Operations link")
	public void user_clicks_on_the_queue_operations_link() {
	    queuepage.clk_Queue_Operations();
	}
	@Then("user should be navigated to Queue Operations page")
	public void user_should_be_navigated_to_queue_operations_page() {
		String expectedTitle = "Queue Operations";
		String actualTitle = queuepage.get_Queue_Operations_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	
}
