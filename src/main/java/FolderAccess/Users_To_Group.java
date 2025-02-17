package FolderAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Users_To_Group extends WebDriverUtility{
	@FindBy(xpath = "//div[@class='card style_1 expendedtree ng-star-inserted']//a[@class='btn']//*[name()='svg']//*[name()='path' and contains(@d,'M6.69096 1')]")private WebElement addGroup;
	@FindBy(xpath = "//div[@class='modal-content']//input[@id='groupname']")private WebElement grpName;
	@FindBy(xpath = "//div[@class='modal-content']/descendant::ng-select[@bindvalue='Id']/descendant::div[@role='combobox']/input[@type='text']")private WebElement addUsers;
	@FindBy(xpath = "//div[@class='modal-content']//button[normalize-space()='Save']")private WebElement save;
	@FindBy(xpath = "//div[@class='modal-content']//button[normalize-space()='Close']")private WebElement cancel;
	@FindBy(xpath = "//li[@aria-label='Grp3']//span[@class='clickablenode folder_icon ng-star-inserted']")private WebElement rightclickaddFolder;
	@FindBy(xpath = "//div[@id='folderactionmenu']//li[@class='contextmenuitems ng-star-inserted'][normalize-space()='Add Folder']")private WebElement addFolder;
	@FindBy(xpath = "//div[@class='modal-body']//input[@id='foldernamedir']")private WebElement folderName;
	@FindBy(xpath = "//div//span[@class='clickablenode']//*[name()='svg']//*[name()='path' and contains(@d,'M459,102H2')]")private WebElement rightclicksubaddFolder;
	@FindBy(xpath = "//div[@class='expendtableparent']//div[@class='title1 pull-left mb-0']//img")private WebElement addFvrt;
	@FindBy(xpath = "//div[@class='expendtableparent']//div[@class='title1 pull-left mb-0']//img")private WebElement addSubFolder;
	@FindBy(xpath = "//div[@id='workingdiraction']//li[@class='contextmenuitems ng-star-inserted'][normalize-space()='Add Folder']")private WebElement addfoldervik;
	@FindBy(xpath = "//a[@id='foldertabsactive']//span[text()='Folders']")private WebElement foldersPage;

	public Users_To_Group(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public WebElement getAddGroup() {
		return addGroup;
	}
	public WebElement getGrpName() {
		return grpName;
	}
	public WebElement getAddUsers() {
		return addUsers;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getrightclick() {
		return rightclickaddFolder;
	}
	public WebElement getAddFolderName() {
		return addFolder;
	}
	public WebElement getFolderName() {
		return folderName;
	}
	public WebElement getAddFvrt() {
		return addFvrt;
	}
	public WebElement getRightclicksubaddFolder() {
		return rightclicksubaddFolder;
	}
	public WebElement getAddfoldervik() {
		return addfoldervik;
	}
	public WebElement getRightclickaddFolder() {
		return rightclickaddFolder;
	}
	public WebElement getAddFolder() {
		return addFolder;
	}
	public WebElement getAddSubFolder() {
		return addSubFolder;
	}
	public WebElement getFoldersPage() {
		return foldersPage;
	}
	
}
