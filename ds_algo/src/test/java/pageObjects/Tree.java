package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementsUtil;

public class Tree {
	public WebDriver driver;
	
	ElementsUtil util=new ElementsUtil();
	//Constructor
		public Tree(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}
		
		
		@FindBy(xpath ="//a[@href=\"tree\"]")
		@CacheLookup
		WebElement TreeGetStartedBtn;
		
		@FindBy(xpath ="//a[@href=\"overview-of-trees\"]")
		@CacheLookup
		WebElement OverviewOfTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/terminologies/\"]")
		@CacheLookup
		WebElement TerminologiesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/types-of-trees/\"]")
		@CacheLookup
		WebElement TypesOfTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/tree-traversals/\"]")
		@CacheLookup
		WebElement TreeTraversalsLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/traversals-illustration/\"]")
		@CacheLookup
		WebElement TraversalsIllustrationLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/binary-trees/\"]")
		@CacheLookup
		WebElement BinaryTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/types-of-binary-trees/\"]")
		@CacheLookup
		WebElement TypesOfBinaryTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/implementation-in-python/\"]")
		@CacheLookup
		WebElement ImpInPythonLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/binary-tree-traversals/\"]")
		@CacheLookup
		WebElement BinaryTreeTraversalsLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/implementation-of-binary-trees/\"]")
		@CacheLookup
		WebElement ImpOfBinaryTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/applications-of-binary-trees/\"]")
		@CacheLookup
		WebElement AppOfBinaryTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/binary-search-trees/\"]")
		@CacheLookup
		WebElement BinarySearchTreesLink;
		
		@FindBy(xpath ="//a[@href=\"/tree/implementation-of-bst/\"]")
		@CacheLookup
		WebElement ImpOfBSTLink;
		
		@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryEditor;
		
		public void tryEditor() {
			tryEditor.click();
		}
		
		public void clk_TreeGetStartedBtn() {
			TreeGetStartedBtn.click();
		}
		public String get_Tree_GetStarted_PageTitle() {
			String treeGetStartedPageTitle = driver.getTitle();
			return treeGetStartedPageTitle;
		}
		public void clk_OverviewOfTrees() {
			OverviewOfTreesLink.click();
		}
		public String get_OverviewOfTrees_PageTitle() {
			String overviewOfTreesPageTitle = driver.getTitle();
			return overviewOfTreesPageTitle;
		}
		public void clk_Terminologies() {
			TerminologiesLink.click();
		}
		public String get_Terminologies_PageTitle() {
			String terminologiesPageTitle = driver.getTitle();
			return terminologiesPageTitle;
		}
		public void clk_TypesOfTrees() {
			TypesOfTreesLink.click();
		}
		public String get_TypesOfTrees_PageTitle() {
			String typesOfTreesPageTitle = driver.getTitle();
			return typesOfTreesPageTitle;
		}
		public void clk_TreeTraversals() {
			TreeTraversalsLink.click();
		}
		public String get_TreeTraversals_PageTitle() {
			String treeTraversalsPageTitle = driver.getTitle();
			return treeTraversalsPageTitle;
		}
		public void clk_TraversalsIllustration() {
			TraversalsIllustrationLink.click();
		}
		public String get_TraversalsIll_PageTitle() {
			String TraversalsIllLinkPageTitle = driver.getTitle();
			return TraversalsIllLinkPageTitle;
		}
		public void clk_BinaryTrees() {
			BinaryTreesLink.click();
		}
		public String get_BinaryTrees_PageTitle() {
			String binaryTreesPageTitle = driver.getTitle();
			return binaryTreesPageTitle;
		}
		public void clk_TypesOfBinaryTrees() {
			TypesOfBinaryTreesLink.click();
		}
		public String get_TypesOfBinaryTrees_PageTitle() {
			String typesOfBinaryTreesPageTitle = driver.getTitle();
			return typesOfBinaryTreesPageTitle;
		}
		public void clk_ImpInPython() {
			ImpInPythonLink.click();
		}
		public String get_ImpInPython_PageTitle() {
			String impInPythonPageTitle = driver.getTitle();
			return impInPythonPageTitle;
		}
		public void clk_BinaryTreeTraversals() {
			BinaryTreeTraversalsLink.click();
		}
		public String get_BinaryTreeTraversals_PageTitle() {
			String binaryTreeTraversalsPageTitle = driver.getTitle();
			return binaryTreeTraversalsPageTitle;
		}
		public void clk_ImpOfBinaryTrees() {
			ImpOfBinaryTreesLink.click();
		}
		public String get_ImpOfBinaryTrees_PageTitle() {
			String impOfBinaryTreesPageTitle = driver.getTitle();
			return impOfBinaryTreesPageTitle;
		}
		public void clk_AppOfBinaryTrees() {
			AppOfBinaryTreesLink.click();
		}
		public String get_AppOfBinaryTrees_PageTitle() {
			String appOfBinaryTreesPageTitle = driver.getTitle();
			return appOfBinaryTreesPageTitle;
		}
		public void clk_BinarySearchTrees() {
			BinarySearchTreesLink.click();
		}
		public String get_BinarySearchTrees_PageTitle() {
			String binarySearchTreesPageTitle = driver.getTitle();
			return binarySearchTreesPageTitle;
		}
		public void clk_ImpOfBST() {
			ImpOfBSTLink.click();
		}
		public String get_ImpOfBST_PageTitle() {
			String impOfBSTPageTitle = driver.getTitle();
			return impOfBSTPageTitle;
		}
}
