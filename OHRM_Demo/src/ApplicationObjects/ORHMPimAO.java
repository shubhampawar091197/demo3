package ApplicationObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORHMPimAO {

	protected WebDriver driver;
	
	
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
	public static WebElement PimTab;
	
	
	@FindBy(xpath="//a[@id='menu_pim_Configuration']")
	public static WebElement ConfigTab;
	
	
	@FindBy(xpath="//a[@id='menu_pim_listCustomFields']")
	public static WebElement CustunderConfig;
	
	//p[@id='listActions']//input[@value='Add']
	@FindBy(xpath="//p[@id='listActions']//input[@value='Add']")
	public static WebElement Addbtn;
	
	//input[@name='customField[name]']/.
	@FindBy(xpath="//input[@name='customField[name]']/.")
	public static WebElement TextBoxUnderAdd;
	
	
	public ORHMPimAO(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
}


