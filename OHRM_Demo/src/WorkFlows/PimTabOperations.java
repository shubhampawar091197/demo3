package WorkFlows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ApplicationPages.OHRMLoginPageActions;
import ApplicationPages.ORHMPimPageAction;
import CommonVariables.CommonConstantAndData;

public class PimTabOperations {

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
	public void operationOnPimTab() throws InterruptedException {
		
		
		ORHMPimPageAction oRHMPimPageAction= new ORHMPimPageAction(driver);
		
		oRHMPimPageAction.clickonPimTab();
		oRHMPimPageAction.hoveronConfigTab();
		oRHMPimPageAction.clickonCustField();
		oRHMPimPageAction.clickonAddBtn();
		oRHMPimPageAction.EnterDataUnderAdd(CommonConstantAndData.dataValueShubham);
		
	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

	
	

}
