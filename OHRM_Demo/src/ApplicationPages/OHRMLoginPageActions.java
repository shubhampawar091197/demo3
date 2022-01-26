package ApplicationPages;

import org.openqa.selenium.WebDriver;

import ApplicationObjects.OHRMLoginAO;

public class OHRMLoginPageActions extends OHRMLoginAO {

	public OHRMLoginPageActions(WebDriver driver) {
		super(driver);	
	}

	public  void enterusername(String data) throws InterruptedException {
		
		username.sendKeys(data);
		Thread.sleep(2000);
	}
	
	public void enterpassword(String data) throws InterruptedException {
		
		password.sendKeys(data);
		Thread.sleep(2000);
	}
	
	public void clickonlogin() throws InterruptedException {
		
		Login.click();
		Thread.sleep(2000);
	}
	
}
