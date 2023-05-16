package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementsUtil;

public class Queue {
	
	public WebDriver driver;
	
	ElementsUtil util=new ElementsUtil();
	//Constructor
		public Queue(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}
	
		@FindBy(xpath ="//a[@href=\"queue\"]")
		@CacheLookup
		WebElement QueueGetStartedBtn;
		
		@FindBy(xpath = "//a[@href=\"implementation-lists\"]")
		@CacheLookup
		WebElement ImpofQueueinPythonLink;
		
		@FindBy(xpath = "//a[@href=\"/queue/implementation-collections/\"]")
		@CacheLookup
		WebElement ImpUsingCollections;
		
		@FindBy(xpath = "//a[@href=\"/queue/Implementation-array/\"]")
		@CacheLookup
		WebElement ImpUsingArray;
		
		@FindBy(xpath = "//a[@href=\"/queue/QueueOp/\"]")
		@CacheLookup
		WebElement QueueOperations;
		
		@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryEditor;
		
		public void clk_QueueGetStarted() {
			QueueGetStartedBtn.click();
		}
		public String get_QueueGetStarted_PageTitle() {
			String queueGetStartedPageTitle = driver.getTitle();
			return queueGetStartedPageTitle;
		}
		
		public void clickTryEditor() {
			tryEditor.click();
		}
		public void clk_Imp_of_Queue_in_Python() {
			ImpofQueueinPythonLink.click();
		}
		public String get_Imp_of_Queue_in_Python_PageTitle() {
			String impofQueueinPythonPageTitle = driver.getTitle();
			return impofQueueinPythonPageTitle;
		}
		public void clk_Imp_Using_Collections_in_Python() {
			ImpUsingCollections.click();
		}
		public String get_Imp_Using_Collections_in_Python_PageTitle() {
			String impUsingCollectionsPageTitle = driver.getTitle();
			return impUsingCollectionsPageTitle;
		}
		public void clk_Imp_Using_Array() {
			ImpUsingArray.click();
		}
		public String get_Imp_Using_Array_PageTitle() {
			String impUsingArrayPageTitle = driver.getTitle();
			return impUsingArrayPageTitle;
		}
		public void clk_Queue_Operations() {
			QueueOperations.click();
		}
		public String get_Queue_Operations_PageTitle() {
			String queueOperationsPageTitle = driver.getTitle();
			return queueOperationsPageTitle;
		}	

}
