package bddTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step {
	
	WebDriver driver;

	@Given("^user launches \"([^\"]*)\"$")
    public void user_launches_something(String url) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
        
    }

    @When("^user enters \"([^\"]*)\" in the google search box$")
    public void user_enters_something_in_the_google_search_box(String entertText) throws Throwable {
    	
    	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(entertText);
        
    }

    @Then("^print the (.*)$")
    public void print_the_url(String text) throws Throwable {
    	
        if(text.equalsIgnoreCase("url")) {
        	System.out.println(driver.getCurrentUrl());
        }
        else if (text.equalsIgnoreCase("title")) {
        	System.out.println(driver.getTitle());
        }
    	
    }
    
    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	
       driver.quit();
    	
    }
}
