package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandi\\git\\InterviewQuestions\\JavaInterview\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		
		// Following
		List<WebElement>al = driver.findElements(By.xpath("//input[@name='password']/following::input"));
		System.out.println(al.size());
		
		// Ancestor
		List<WebElement>al1 = driver.findElements(By.xpath("//*[contains(text(),'Enterprise')]/ancestor::div"));
		System.out.println(al1.size());
		
		// Child
		List<WebElement>al2 = driver.findElements(By.xpath("//*[@id='java_technologies']/child::li"));
		System.out.println(al2.size());
		
		// Preceding
		List<WebElement>al3 = driver.findElements(By.xpath("//input[@name = 'btnLogin']/preceding::input"));
		System.out.println(al3.size());
		
		// Following sibling
		
		WebElement reset = driver.findElement(By.xpath("//input[@name='btnLogin']/following-sibling::input"));
		System.out.println(reset.getAttribute("Value"));
		
		// Parent
		
		WebElement hp = driver.findElement(By.xpath("//a[@title='HP Loadrunner']/parent::li"));
		System.out.println(hp.getText());
		
		
		driver.close();

	}

}
