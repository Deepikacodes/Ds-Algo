package stepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.LinkedList;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class LinkedList_SD {

	LinkedList ll = new LinkedList(DriverFactory.getDriver());
	
	String Excelpath=ConfigReader.getExcelFilePath();
	static String expectedMsg;
	
	//@linkedlist01
	@When("User clicks on the Get Started button inside LinkedList frame")
	public void user_clicks_on_the_get_started_button_inside_linked_list_frame() {
		ll.clkGetStartedBtn();
		LoggerLoad.info("Navigating to the Linked List page");
	}
	@Then("User should be navigated to Linked List home page")
	public void user_should_be_navigated_to_linked_list_home_page() {
		String expectedTitle = "Linked List";
		String actualTitle = ll.getLinkedListPageTitle();
		LoggerLoad.info("The title of the current page:"+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		
	}
	@When("User clicks on the Introduction link")
	public void user_clicks_on_the_introduction_link() {
		  ll.clkIntroLink();
	}
	@Then("user should be navigated to Linked lists introduction page")
	public void user_should_be_navigated_to_linked_lists_introduction_page() {
		String expectedTitle = "Introduction";
		String actualTitle = ll.getLLIntroPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the Try Here button in Linked List")
	public void user_clicks_on_the_try_here_button_in_linked_list() {
	    ll.clkIntroTryHereBTn();
	}
	@Then("User should be navigated to Try Editor page")
	public void user_should_be_navigated_to_try_editor_page() {
		String expectedTitle = "Assessment";
		String actualTitle = ll.getTryEditorTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	//@linkedlist02
	
	@When("User enters a valid python code from sheet {string} and {int}")
	public void user_enters_a_valid_python_code_from_sheet_and(String sheetName, Integer rowNumber) 
			throws InvalidFormatException, IOException, InterruptedException {
	    ll.enterPythonCode(sheetName, rowNumber);
	    expectedMsg = ll.getExpectedResult(sheetName, rowNumber);
	    ll.clkRunBtn();
	}
	@Then("User should get an valid output")
	public void user_should_get_an_valid_output() {
	    String actualMsg = ll.getActualResult();	
	    LoggerLoad.info("The actual message:"+actualMsg);
	    Assert.assertEquals(actualMsg, expectedMsg, "Result do not match");
	}
	
	//@linkedlist03 
	@When("User enters an invalid python code from sheet {string} and {int}")
	public void user_enters_an_invalid_python_code_from_sheet_and(String sheetNumber, Integer rowNumber) 
			throws InterruptedException, InvalidFormatException, IOException {
		ll.pageReload();
		Thread.sleep(1000);
		ll.enterPythonCode(sheetNumber, rowNumber);
		ll.clkRunBtn();
	}
	@Then("User should get an popup alert")
	public void user_should_get_an_popup_alert() {
		ll.acceptAlertMsg();
		LoggerLoad.info("Accepting the pop alert and navigating back");
	    ll.navigateBack();
	}
	
	//@linkedlist04
	@When("User clicks on the Creating Linked List link")
	public void user_clicks_on_the_creating_linked_list_link() {
		ll.clkCreatingLinkedListLink();
	}
	@Then("user should be navigated to Creating Linked List page")
	public void user_should_be_navigated_to_creating_linked_list_page() {
		String expectedTitle = "Creating Linked LIst";
		String actualTitle = ll.get_Creating_LL_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page:"+actualTitle);
	}
     
	//@linkedlist07
	@When("User clicks on the Types of Linked List link")
	public void user_clicks_on_the_types_of_linked_list_link() {
		  ll.clk_Types_Of_LinkedList_Link();
	}
	@Then("User should be navigated to Types of Linked List")
	public void user_should_be_navigated_to_types_of_linked_list() {
		String expectedTitle = "Types of Linked List";
		String actualTitle = ll.get_Types_Of_LinkedList_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page:"+actualTitle);
	}
     
	//@linkedlist10
	@When("User clicks on Implement Linked List in Python link")
	public void user_clicks_on_implement_linked_list_in_python_link() {
		 ll.navigateBack();
		 ll.clk_Implement_LL_In_Python();
	}
	@Then("User should be navigated to Implement Linked List in Python page")
	public void user_should_be_navigated_to_implement_linked_list_in_python_page() {
		String expectedTitle = "Implement Linked List in Python";
		String actualTitle = ll.get_Implement_LL_In_Python_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page "+actualTitle);
	}
	
	//@linkedlist13
	@When("User clicks on the Traversal link")
	public void user_clicks_on_the_traversal_link() {
		  ll.navigateBack();
		  ll.clk_Traversal_Link();
	}
	@Then("User should be navigated to Traversal page")
	public void user_should_be_navigated_to_traversal_page() {
		String expectedTitle = "Traversal";
		String actualTitle = ll.get_Traversal_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page "+actualTitle);
	}
     
	//@linkedlist16
	@When("User clicks on the Insertion link")
	public void user_clicks_on_the_insertion_link() {
		ll.navigateBack();
		ll.clk_Insertion_Link();
	}
	
	@Then("User should be navigated to Insertion page")
	public void user_should_be_navigated_to_insertion_page() {
		String expectedTitle = "Insertion";
		String actualTitle = ll.get_Insertion_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page "+actualTitle);
	}
     
	//@linkedlist19
	@When("User clicks on the Deletion link")
	public void user_clicks_on_the_deletion_link() {
		ll.navigateBack();
	    ll.clk_Deletion_Link();
	}
	@Then("User should be navigated to Deletion page")
	public void user_should_be_navigated_to_deletion_page() {
		String expectedTitle = "Deletion";
		String actualTitle = ll.get_Deletion_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		LoggerLoad.info("The title of the current page "+actualTitle);
	}




	}



