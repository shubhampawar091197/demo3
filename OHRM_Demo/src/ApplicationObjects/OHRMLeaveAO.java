package ApplicationObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMLeaveAO {

	protected WebDriver driver;
	
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']/.") //click
	public static WebElement LeaveTab;
	
	
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']")   //hover
	public static WebElement EntitleUnderLeave;
	
	
	@FindBy(xpath="//a[@id='menu_leave_addLeaveEntitlement']")   //click
	public static WebElement AddLeaveUnderEntitle;
	
	//input[@type='text' and @name='entitlements[employee][empName]']
	@FindBy(xpath="//input[@type='text' and @name='entitlements[employee][empName]']") //sendkeys
	public static WebElement TextboxUnderAdd;
	
	@FindBy(xpath="//select[@name='entitlements[leave_type]']")    //click
	public static WebElement DropdownUnderAddLeave;
	
	//select[@id='entitlements_leave_type']//option
	////option[text()='CAN - Matternity']
	@FindBy(xpath="//select[@id='entitlements_leave_type']//option")   //click
	public static WebElement SelectDropDownUnderAddLeave;
	
	
	public OHRMLeaveAO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	
	
	
	
}
