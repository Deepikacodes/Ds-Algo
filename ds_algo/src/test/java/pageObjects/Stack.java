package pageObjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.ElementsUtil;

public class Stack {

	public WebDriver driver;
	
	String stackUrl=ConfigReader.stackUrl();
	
	ElementsUtil util=new ElementsUtil();
	//Constructor
		public Stack(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}
		
		
		@FindBy(xpath="//a[@href='stack']") WebElement getStartedBtn;
		
		@FindBy(xpath="//a[@href='operations-in-stack']") WebElement opStack;
		
		@FindBy(xpath="//a[@href='implementation']") WebElement implementation;
		
		@FindBy(xpath="//a[@href='stack-applications']") WebElement applications;

		@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryEditor;
		
		@FindBy (xpath ="//textarea[@tabindex='0']")WebElement textEditor; 
		
		@FindBy(xpath="//button[@type='button']") WebElement runBtn;
		
		@FindBy(xpath="//pre[@id='output']") WebElement output;
		
		@FindBy(xpath="//a[@href='/stack/operations-in-stack/']") WebElement stackOpStack;
		
		@FindBy(xpath="//a[@href='/stack/implementation/']") WebElement stackImplementation;
		
		@FindBy(xpath="//a[@href='/stack/stack-applications/']") WebElement stackApplications;
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		
		public void clickGetStarted() {
			getStartedBtn.click();
		}
		
		public void getStackUrl() throws Exception {
			driver.get(stackUrl);
			Thread.sleep(500);
		}
		
		public void clickOperationsInStack() {
			util.waitForElement(opStack);
			opStack.click();
		}
		
		public void clickImplementation() {
			implementation.click();
		}
		public void clickAppStack() {
			applications.click();
		}
		
		
		public void clickInOperationsInStack() {
			util.waitForElement(stackOpStack);
			stackOpStack.click();
		}
		
		public void clickInImplementation() {
			stackImplementation.click();
		}
		public void clickInAppStack() {
			stackApplications.click();
		}
		public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
			String code = util.getCodefromExcel(sheetname, rownumber);
			util.enterCode(code, textEditor);

		}
         
		public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
			String expectedResult = util.getResultfromExcel(sheetName, rowNum);
			return expectedResult;
		}
		
		public String getActualResult() {
			util.waitForElement(output);
			return output.getText();

		}
		
		public void clickRunBtn() {
			runBtn.click();
		}
		
		public void navigateBack() {
			driver.navigate().back();
		}
		public String getErrorText() throws InterruptedException {
			String errorMsg = driver.switchTo().alert().getText();
			Thread.sleep(500);
			driver.switchTo().alert().accept();
			return errorMsg;

		}
}
