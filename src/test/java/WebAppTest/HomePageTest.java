package WebAppTest;

//import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class HomePageTest {		
	private WebDriver driver;	
		@Test				
	public void testHomePage() throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver","D:\\Profiles\\Durga\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp");  
		String title = driver.getTitle();	
		System.out.println("title-->"+title);
		Thread.sleep(5000);
		Assert.assertTrue(title.contains("Home Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver","D:\\Profiles\\Durga\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		
		driver.quit();			
	}		
}	