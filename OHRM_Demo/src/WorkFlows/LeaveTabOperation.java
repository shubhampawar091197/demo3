package WorkFlows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ApplicationPages.OHRMLeavePageAction;
import ApplicationPages.OHRMLoginPageActions;
import CommonVariables.CommonConstantAndData;

public class LeaveTabOperation {

	WebDriver driver;
	 
	@BeforeTest
	public void setup() {
		
		System.setProperty(CommonConstantAndData.chromeDrivervalue,CommonConstantAndData.chromeDriverPathValue);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//jabtak elements load nhi hote tab tak
		
		driver.manage().window().maximize();
		
		driver.navigate().to(CommonConstantAndData.oHRMURLValue);
	
	}

	@Test(priority=1)
	public void loginORHMTest() throws InterruptedException {
					
		OHRMLoginPageActions ohrmLoginPageActions = new OHRMLoginPageActions(driver);
		ohrmLoginPageActions.enterusername(CommonConstantAndData.userNameValue);
		ohrmLoginPageActions.enterpassword(CommonConstantAndData.passwordValue);
		ohrmLoginPageActions.clickonlogin();	
	}

	@Test(priority=2)
	public void operationOnLeaveTab() throws InterruptedException {
		
		OHRMLeavePageAction oHRMLeavePageAction=new OHRMLeavePageAction(driver); 
		oHRMLeavePageAction.ClickonLeaveTab();
		oHRMLeavePageAction.HoverOnEntitlements();
		oHRMLeavePageAction.clickOnAddEntitle();
		oHRMLeavePageAction.enterDataUnderAddLeave(CommonConstantAndData.dataValueShubham);
		oHRMLeavePageAction.clickOnSelectDropdown();
		oHRMLeavePageAction.SelectUnderDropdown();
	}
}
