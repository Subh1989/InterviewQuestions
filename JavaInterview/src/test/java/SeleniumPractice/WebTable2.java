package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		// Get all the values of a Dynamic Table
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandi\\git\\InterviewQuestions\\JavaInterview\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(int i=0; i<rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of cells in row "+i+" are "+cols.size());
			
			for(int j=0; j<cols.size(); j++)
			{
				String cellText = cols.get(j).getText();
				System.out.println("The cell text present in row "+i+" and column "+j+" :: "+cellText);
			}
			System.out.println("---------------------------------------");
		}
		
		

	}

}
