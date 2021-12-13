package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void init(String browser) {
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		case "default":
			driver = null;
			break;
		}

	}
	
	@Test
	public void verifyPageTitle() {
		
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
