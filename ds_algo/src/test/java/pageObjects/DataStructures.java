package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerLoad;


public class DataStructures {

	public WebDriver driver;
	
	
	//Constructor
	public DataStructures(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);  //initializing WebElements	
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement  userTxt;
	@FindBy(xpath="//input[@name='password']") WebElement  pwdTxt;
	@FindBy(xpath="//input[@type='submit']") WebElement  loginBtn;
	
	@FindBy(xpath="//a[@href='data-structures-introduction']") WebElement dsIntroLink;
	
	@FindBy (xpath="//a[@href='time-complexity']")WebElement timeComplexitylink;
	
	@FindBy(xpath ="//a[text()='Try here>>>']")WebElement tryHereBtn;
	@FindBy (xpath ="//form/div/div/div/textarea")WebElement codeEditor; 
	@FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
	@FindBy(xpath="//pre[@id='output']") WebElement output;

	
	
	public void  enterUserPwd(String Username,String Password) {
		userTxt.clear();
		userTxt.sendKeys(Username);
		pwdTxt.clear();
		pwdTxt.sendKeys(Password);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	public void getStarted_DS() {
		LoggerLoad.info("click " + dsIntroLink.getText() + " on home page");
		dsIntroLink.click();
	}
     
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void clickOnTimeComplexitylink() throws Exception  {
		Thread.sleep(1000);
		timeComplexitylink.click();

	}
	public void clickTryHereBtn() throws Exception {
		Thread.sleep(1000);
		tryHereBtn.click();
	}
    public void entercode(String pythonCode)  {
    	codeEditor.sendKeys(pythonCode);
    }
	
    public void clickRunBtn() throws InterruptedException {
		Thread.sleep(1000);
		runBtn.click();
	}
    
    public String validateOutput() {
    	return output.getText();
    }
    
	}
	


