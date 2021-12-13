package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//Fetch number of rows and columns from Dynamic WebTable
		
		List<WebElement> colCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println(colCount.size());
		System.out.println(rowCount.size());
		
		// Fetch cell value of a particular row and column of the Dynamic Table (Row 4, column 3)
		
		String value = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[4]/td[3]")).getText();
		System.out.println(value);
		
		// Get Maximum of all the Values in a Column of Dynamic Table
		
		List<WebElement>prevClose = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		double val = Double.parseDouble(prevClose.get(0).getText());
		
		for(int i=0; i<prevClose.size(); i++)
		{
			double allValues = Double.parseDouble(prevClose.get(i).getText());
			if(allValues>val)
			{
				val = allValues;
			}
		}
		System.out.println(val);

	}

}
