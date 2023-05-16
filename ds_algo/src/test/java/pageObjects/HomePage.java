package pageObjects;


import utilities.ElementsUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;

public class HomePage {
	private WebDriver driver;
	//WebDriverWait wait;
	String URL=ConfigReader.getApplicationUrl();
    String HomepageUrl=ConfigReader.getHomePageUrl();
    ElementsUtil util= new ElementsUtil();
//constructor 
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initializing WebElelements
	}

//Get Started button
	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartedBtn;

//Error message
	@FindBy(xpath = "//div[@role='alert']")
	@CacheLookup
	WebElement errorMessage;

//HomePage dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	@CacheLookup
	WebElement dropDownLink;

	@FindBy(xpath = "//a[text()='Arrays']")
	@CacheLookup
	WebElement dropdown_array;

	@FindBy(xpath = "//a[text()='Linked List']")
	@CacheLookup
	WebElement dropdown_linkedlist;

	@FindBy(xpath = "//a[text()='Stack']")
	@CacheLookup
	WebElement dropdown_stack;

	@FindBy(xpath = "//a[text()='Queue']")
	@CacheLookup
	WebElement dropdown_queue;

	@FindBy(xpath = "//a[text()='Tree']")
	@CacheLookup
	WebElement dropdown_tree;

	@FindBy(xpath = "//a[text()='Graph']")
	@CacheLookup
	WebElement dropdown_graph;

//HomePage Get Started buttons
	@FindBy(xpath = "//a[@href ='data-structures-introduction']")
	WebElement getStartedDS;
	@FindBy(xpath = "//a[@href ='array']")
	WebElement getStartedArray;
	@FindBy(xpath = "//a[@href ='linked-list']")
	WebElement getStartedLinkedList;
	@FindBy(xpath = "//a[@href ='stack']")
	WebElement getStartedStack;
	@FindBy(xpath = "//a[@href ='queue']")
	WebElement getStartedQueue;
	@FindBy(xpath = "//a[@href ='tree']")
	WebElement getStartedTree;
	@FindBy(xpath = "//a[@href ='graph']")
	WebElement getStartedGraph;

//Sign in
	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement signin;

//Register
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;

	//Actions or Methods
	public void app_url() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);
		
	}
	
	public void getstarted_btn() throws InterruptedException  {
		Thread.sleep(1000);
		getStartedBtn.click();

	}

	public String getHomePageTitle()  {
		
		return driver.getTitle();
	}

	public void homePage_url() throws InterruptedException {
		Thread.sleep(500);
		driver.get(HomepageUrl);
	}
	
	public void dropdown(String strItem) throws InterruptedException {

		dropDownLink.click();
		Thread.sleep(500);

		switch (strItem) {

		case "Arrays":

			dropdown_array.click();
			break;

		case "Linked List":

			dropdown_linkedlist.click();
			break;

		case "Stack":

			dropdown_stack.click();
			break;
		case "Queue":

			dropdown_queue.click();
			break;
		case "Tree":

			dropdown_tree.click();
			break;
		case "Graph":

			dropdown_graph.click();
			break;
		default:
			break;
		}
	}

	public void getStartedHome(String string) throws InterruptedException {

		switch (string) {
		
		case "Data Structures":
			
			getStartedDS.click();
			break;
		
		case "Arrays":

			getStartedArray.click();
			break;
				
		case "Linked List":

			getStartedLinkedList.click();
			break;
		case "Stack":

			getStartedStack.click();
			break;
		case "Queue":

			getStartedQueue.click();
			break;
		case "Tree":

			getStartedTree.click();
			break;
		case "Graph":

			getStartedGraph.click();
			break;
		}
	}

	public String errorMsg() throws Exception  {
		Thread.sleep(500);
		String errorMsg=errorMessage.getText().trim();
		return errorMsg;
	}
	public void signInLink() throws InterruptedException {
		util.waitForElement(signin);
		signin.click();
	}

	public String loginPageTitle() {
		String  lptitle=driver.getTitle().trim();
		return lptitle;
	}
	public void Register() {
		register.click();
	}
	public String registerTitle() {
		String  r_title=driver.getTitle().trim();
		return r_title;
	}
}
