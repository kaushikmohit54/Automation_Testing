package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "S:\\Mipss_Rm\\automation_Testing\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}
	

}
