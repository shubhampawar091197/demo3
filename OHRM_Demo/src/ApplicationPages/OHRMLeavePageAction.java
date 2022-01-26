package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ApplicationObjects.OHRMLeaveAO;

public class OHRMLeavePageAction extends OHRMLeaveAO {

	WebDriver driver;
	
	public OHRMLeavePageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ClickonLeaveTab() throws InterruptedException {
		
		if(LeaveTab.isDisplayed()) {
			LeaveTab.click();
			Thread.sleep(1000);
		}
		else {
		
			System.err.println("Element not found"+LeaveTab+"hence not able to click");
		}
	}
	
	public void HoverOnEntitlements() throws InterruptedException {
		
		if(EntitleUnderLeave.isDisplayed()) {
			
			Actions action=new Actions(super.driver);
			action.moveToElement(EntitleUnderLeave).click().build().perform();
		}
		else {
			System.err.println("Element not found"+EntitleUnderLeave+"hence not able to click");
		}
		Thread.sleep(2000);
	}
	
	public void clickOnAddEntitle() throws InterruptedException {
		if(AddLeaveUnderEntitle.isDisplayed()) {
			AddLeaveUnderEntitle.click();
			Thread.sleep(2000);
		}
		else {
			System.err.println("Element not found"+AddLeaveUnderEntitle+"hence not able to click");
		}	
	}
	
	public void enterDataUnderAddLeave(String data) throws InterruptedException {
		if(TextboxUnderAdd.isDisplayed() && TextboxUnderAdd.isEnabled()) {
			TextboxUnderAdd.sendKeys(data);
			Thread.sleep(2000);
		}
		else {
			System.err.println("Element not found"+TextboxUnderAdd+"hence not able to click");
		}
		Thread.sleep(2000);
	}
	
	public void clickOnSelectDropdown() throws InterruptedException {
		
		if(DropdownUnderAddLeave.isDisplayed()) {
			DropdownUnderAddLeave.click();
			Thread.sleep(2000);
		}
		else {
			System.err.println("Element not found"+DropdownUnderAddLeave+"hence not able to click");
		}
	}
	
	
	public void SelectUnderDropdown() throws InterruptedException {
		if(SelectDropDownUnderAddLeave.isDisplayed()) {
			SelectDropDownUnderAddLeave.click();
			Select selectelement=new Select(SelectDropDownUnderAddLeave);
			selectelement.selectByVisibleText("CAN - Matternity");
			
			Thread.sleep(2000);
		}
		else {
			System.err.println("Element not found"+DropdownUnderAddLeave+"hence not able to click");
		}
	}
	
}
