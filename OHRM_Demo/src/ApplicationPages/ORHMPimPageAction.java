package ApplicationPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ApplicationObjects.ORHMPimAO;

public class ORHMPimPageAction extends ORHMPimAO {
 
	WebDriver driver;
	
	public ORHMPimPageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickonPimTab() throws InterruptedException {
		
		if(PimTab.isDisplayed())
		{
			PimTab.click();
			Thread.sleep(2000);
		}
		else {
			
			System.err.println("Element not Found"+PimTab+"hence not be able to click");
		}	
		
		
	}
	
	public void hoveronConfigTab() throws InterruptedException {
		
		if(ConfigTab.isDisplayed()) {
			Actions action=new Actions(super.driver);
			action.moveToElement(ConfigTab).click().build().perform();
		}
		else {
			System.err.println("......"+ConfigTab+".....");
		}
		Thread.sleep(2000);  
		
	}
	
	
	public void clickonCustField() throws InterruptedException {
		
		if(CustunderConfig.isDisplayed()) 
		{
			CustunderConfig.click();
			Thread.sleep(2000);
		}
		else {
			System.err.println("Element not found"+CustunderConfig+"hence not able to click");
		}
		
	}
	

	
	public void clickonAddBtn() throws InterruptedException  {
		if(Addbtn.isDisplayed()) {
			Addbtn.click();
			Thread.sleep(2000);
		}
		else {
			System.err.println("button not found"+Addbtn+"hence not able to click");
		}
	}
	
	
	public void EnterDataUnderAdd(String data) throws InterruptedException {
		if(TextBoxUnderAdd.isDisplayed() && TextBoxUnderAdd.isEnabled()) 
		{
			TextBoxUnderAdd.sendKeys(data);
			Thread.sleep(2000);
		}
		else {
			System.err.println("unable to enter data"+TextBoxUnderAdd+" text field not found");
		}		
	}
	
}
