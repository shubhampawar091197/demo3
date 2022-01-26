package ApplicationObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMAdminAO {

	WebDriver driver;
	
	//a[@id='menu_admin_viewAdminModule']//..a
	@FindBy(xpath="//b[text()='Admin']/..")
	public static WebElement adminTab;
	
	//a[@id='menu_admin_UserManagement']//..
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	public static WebElement userManagement;
	
	//a[@id='menu_admin_viewSystemUsers']
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	public static WebElement usersUnderUserManagement;
	
	//input[@name='searchSystemUser[userName]']
	@FindBy(xpath="//input[@name='searchSystemUser[userName]']")
	public static WebElement userNametext;
		
	public OHRMAdminAO(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
}
 