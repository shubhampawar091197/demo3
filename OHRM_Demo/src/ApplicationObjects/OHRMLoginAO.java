//we have allocate the locators in on page 
package ApplicationObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMLoginAO {

	WebDriver driver;
	
	//pagefactory element which tag the xpath
	@FindBy(xpath="//input[@id='txtUsername']")
	public static WebElement username;
		
	//div[@id='divPassword']
	@FindBy(xpath="//input[@id='txtPassword']")
	public static WebElement password;
	
	//input[@id='btnLogin']
	@FindBy(xpath="//input[@id='btnLogin']")
	public static WebElement Login;
	
	public OHRMLoginAO(WebDriver driver) {				//constructor
		this.driver = driver;							//initialize with the current object
		PageFactory.initElements(driver, this);			//find the elements on the chromedriver.
		//collection of object//every object are created to every page
	}
	
	
	
	
}
