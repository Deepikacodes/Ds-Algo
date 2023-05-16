package pageObjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ElementsUtil;

public class LinkedList {

	public WebDriver driver;
	
	ElementsUtil util=new ElementsUtil();
	//Constructor
		public LinkedList(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}
	
		@FindBy(xpath = "//a[@href=\"linked-list\"]")
		@CacheLookup
		WebElement LLGetStartedBtn;
			
		@FindBy(xpath = "//a[@href=\"introduction\"]" )
		@CacheLookup
		WebElement LLIntroLink;
		
		@FindBy(linkText = "Try here>>>")
		@CacheLookup
		WebElement TryHereBtn;
		
		@FindBy(xpath= "//button[@type=\"button\"]")
		@CacheLookup
		WebElement RunBtn;
		
		@FindBy(linkText = "singly linked list" )
		@CacheLookup
		WebElement SinglyLinkedListLink;
		
		@FindBy(linkText ="linked list" )
		@CacheLookup
		WebElement LinkedListLink;
		
		@FindBy(linkText = "doubly linked list")
		@CacheLookup
		WebElement DoublyLinkListLink;
		
		@FindBy(xpath = "//a[@href=\"https://www.javatpoint.com/ds-types-of-linked-list\"]")
		@CacheLookup
		WebElement TypesOfTheLinkListLink;
		
		@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
		@CacheLookup
		WebElement InputTextArea;
		
		@FindBy(id="output")
		@CacheLookup
		WebElement OutputTextArea;
		
		@FindBy(xpath="//a[@href=\"/linked-list/creating-linked-list/\"]")
		@CacheLookup
		WebElement CreatingLinkedListLink;
		
		@FindBy(xpath="//a[@href=\"/linked-list/types-of-linked-list/\"]")
		@CacheLookup
		WebElement typesOfLinkedListLink;
		
		@FindBy(xpath="//a[@href=\"/linked-list/implement-linked-list-in-python/\"]")
		@CacheLookup
		WebElement implementLinkedListInPython;
		
		@FindBy(xpath="//a[@href=\"/linked-list/traversal/\"]")
		@CacheLookup
		WebElement TraversalLink;
		
		@FindBy(xpath="//a[@href=\"/linked-list/insertion-in-linked-list/\"]")
		@CacheLookup
		WebElement InsertionLink;
		
		@FindBy(xpath="//a[@href=\"/linked-list/deletion-in-linked-list/\"]")
		@CacheLookup
		WebElement DeletionLink;
		
		@FindBy(xpath="//a[@href=\"/linked-list/practice\"]")
		@CacheLookup
		WebElement PracticeQuestionsLink;
		
		@FindBy(xpath="//td/div[1]/a[@href=\"https://www.javatpoint.com\"]")
		@CacheLookup
		WebElement JavaTPointLogo;
		
		
		public void clkGetStartedBtn() {		
			LLGetStartedBtn.click();
		}	
		public String getLinkedListPageTitle() {
			String linkedlistPageTitle = driver.getTitle();
			return linkedlistPageTitle;
		}	
		public void clkIntroLink() {		
			LLIntroLink.click();
		}
		public String getLLIntroPageTitle() {
			String introPageTitle = driver.getTitle();
			return introPageTitle;
		}
		public void clkIntroTryHereBTn() {
			TryHereBtn.click();
		}
		public String getTryEditorTitle() {
			String TryEditorPageTitle = driver.getTitle();
			return TryEditorPageTitle;
		}
		public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
			String code = util.getCodefromExcel(sheetname, rownumber);
			util.enterCode(code, InputTextArea);				
		}
		public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
			String expectedResult = util.getResultfromExcel(sheetName, rowNum);
			return expectedResult;
		}
		public void clkRunBtn() throws InterruptedException {
			Thread.sleep(1000);
			RunBtn.click();
		}
		public String getActualResult() {
			return OutputTextArea.getText();
		}
		public void acceptAlertMsg() {
			driver.switchTo().alert().accept();
		}
		public void pageReload() {
			driver.navigate().back();
			try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", TryHereBtn);
			TryHereBtn.click();
			}
			catch(StaleElementReferenceException e) {
			}
		}
		
		public void navigateBack() {
			driver.navigate().back();
		}
		public void clkCreatingLinkedListLink() {
			CreatingLinkedListLink.click();
		}
		public String get_Creating_LL_PageTitle() {
			String creatingLinkedListPageTitle = driver.getTitle();
			return creatingLinkedListPageTitle;
		}
		public void clk_Types_Of_LinkedList_Link() {
			typesOfLinkedListLink.click();
		}
		public String get_Types_Of_LinkedList_PageTitle() {
			String typesofLinkedListPageTitle = driver.getTitle();
			return typesofLinkedListPageTitle;
		}
		public void clk_Singly_LinkedList_Link() {
			SinglyLinkedListLink.click();

			//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					  //.withTimeout(Duration.ofSeconds(30))
					  //.pollingEvery(Duration.ofSeconds(5)).ignoring(TimeoutException.class);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			//wait.until(ExpectedConditions.titleContains("Linked List (Data Structures) - javatpoint"));
					//titleIs("Linked List (Data Structures) - javatpoint"));
		}
		public String get_Singly_LinkedList_PageTitle() {
			/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.titleIs("Linked List (Data Structures) - javatpoint"));*/
			/*if(driver.getTitle() != null && driver.getTitle().contains("Linked List (Data Structures) - javatpoint")){
				  System.out.println("Web page is opened");
				}
				else{
				  System.out.println("Web page could not open.");
				}*/
			String singlyLinkedListPageTitle = driver.getTitle();
			return singlyLinkedListPageTitle;
			
			/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.visibilityOf(JavaTPointLogo));*/
			
			
			/*try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				wait.until(ExpectedConditions.visibilityOf(JavaTPointLogo));
			    //element_present = EC.presence_of_element_located(())
			    //WebDriverWait(driver, timeout).until(element_present)
			    System.out.println("1 - Element is present on the page");		    
			}
			catch(TimeoutException e)
			{
			    System.out.println("1 - Timed out waiting for page to load ");		    
			}
			*/
			
				
		}

		/*public void clk_LinkedList_Link() {
			LinkedListLink.click();
		}
		public String get_LinkedList_PageTitle() {
			String linkedListPageTitle = driver.getTitle();
			return linkedListPageTitle;
		}*/
		public void clk_Doubly_LinkedList_Link() {
			DoublyLinkListLink.click();
		}
		public String get_Doubly_LinkedList_PageTitle() {
			String doublyLinkedListPageTitle = driver.getTitle();
			return doublyLinkedListPageTitle;
		}
		public void clk_Types_Of_The_LinkedList_Link() {
			TypesOfTheLinkListLink.click();
		}
		public String get_Types_Of_The_LinkedList_PageTitle() {
			String doublyLinkedListPageTitle = driver.getTitle();
			return doublyLinkedListPageTitle;
		}
		public void clk_Implement_LL_In_Python() {
			implementLinkedListInPython.click();
		}
		public String get_Implement_LL_In_Python_PageTitle() {
			String implementLinkedListInPythonPageTitle = driver.getTitle();
			return implementLinkedListInPythonPageTitle;
		}
		public void clk_Traversal_Link() {
			TraversalLink.click();
		}
		public String get_Traversal_PageTitle() {
			String traversalPageTitle = driver.getTitle();
			return traversalPageTitle;
		}
		public void clk_Insertion_Link() {
			InsertionLink.click();
		}
		public String get_Insertion_PageTitle() {
			String insertionPageTitle = driver.getTitle();
			return insertionPageTitle;
		}
		public void clk_Deletion_Link() {
			DeletionLink.click();
		}
		public String get_Deletion_PageTitle() {
			String deletionPageTitle = driver.getTitle();
			return deletionPageTitle;
		}
		public void clk_PracticeQuestions_Link() {
			PracticeQuestionsLink.click();
		}
		public String get_PracticeQuestions_PageTitle() {
			String practicequestionsPageTitle = driver.getTitle();
			return practicequestionsPageTitle;
		}
	
}
