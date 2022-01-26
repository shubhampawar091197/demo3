//webdriver is a interface and have methods
//to perform the operation on the browser 
//properties can be done in the chromedriver
//then we call the methods of the driver.
//
//we use locators to access the elements from the html code
//webdriver joh khalli hai, and we use chrome browser and operate operation on chrome driver
//and we have to you method of interface
//chrome driver

//Search context is a interface which have blank methods		interface extends interface
//webdriver is a interface which have its different blank methods
//

//xpath structure()
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestEq {

	//webdriver is an interface
	//
	
	static WebDriver driver; 
	@Test
	
	public static void testGoogleSearch3() throws InterruptedException {
		
// Optional. If not specified, WebDriver searches the PATH for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		//just focus on chrome and access the exe file just to use.....At backend the exe file gets executed 
		//chrome instance get open at time of the test 
		
		// WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
	//parent class object                 
		
		driver.manage().window().maximize();		//to maximize the window size
		
		//driver.get goes only in forward directions
		//driver.navigate goes forward and backword directions in the browser
		driver.get("http://www.google.com/");

		Thread.sleep(5000); // Let the user actually see something!b           
		//findthe element whos name starts with q in the browser
		
		
		WebElement searchBox = driver.findElement(By.name("q"));//its an element on the browser
searchBox.sendKeys("youtube");

		searchBox.submit();
		Thread.sleep(1000);
		//h3[text()='YouTube']
		driver.findElement(By.xpath("//h3[text()='YouTube']")).click();

		Thread.sleep(2000);
		//input[@id='search']
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("wiz khalifa");
		
		
		Thread.sleep(1000);
		//button[@id='search-icon-legacy']
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(5000); // Let the user actually see something!

		driver.quit();

	}
	
}
