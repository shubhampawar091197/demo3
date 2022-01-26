package ApplicationPages;

import org.openqa.selenium.WebDriver;

import ApplicationObjects.OHRMAdminAO;

public class OHRMAdminPageAction extends OHRMAdminAO {

	WebDriver driver;
	
	public OHRMAdminPageAction(WebDriver driver) {
		super(driver);
	}

	public void clickOnAdminTab() throws InterruptedException {
		if(adminTab.isDisplayed()) {
			adminTab.click();
		Thread.sleep(2000);
		}
		else {
			System.err.println("Since The Element:"+adminTab+"is not displayed, it cannot be clicked");
		}
	}
	
	public void clickOnuserManagement() throws InterruptedException {
		if(userManagement.isDisplayed()) {
			userManagement.click();
		 Thread.sleep(1000);
		}
		else {
			System.err.println("Since the Element:"+userManagement+"is not displayed, it cannot clicked");
		}
	}

	public void hoverOnuserUnderUserManagement() throws InterruptedException {
		
		if(usersUnderUserManagement.isDisplayed()) {
			usersUnderUserManagement.click();
		Thread.sleep(2000);
		}
		else {
			System.err.println("Since The Element:"+usersUnderUserManagement+"is not displayed, it cannot be clicked");
		}
	}
	
	public void enterDataInuserNameText(String data) throws InterruptedException {
		if(userNametext.isDisplayed() && userNametext.isEnabled()) {
		userNametext.sendKeys(data);
		Thread.sleep(2000);
		}
		else {
			System.err.println("Since The Element:"+userNametext+"is not displayed, it cannot typed in it...");
		}
	}

}
