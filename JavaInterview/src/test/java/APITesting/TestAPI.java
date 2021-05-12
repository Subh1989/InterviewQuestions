package APITesting;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class TestAPI {

	JsonPath js;
	List<Object>totalCourses;
	int purchaseAmount;
	
	@Test(priority=1)
	public void getCourses()
	{
		js = new JsonPath(Payload.getPayload());
		totalCourses = js.getList("courses");
		System.out.println("Total count of courses are :: "+totalCourses.size());
	}
	
	@Test(priority=2)
	public void getPurchaseAmount()
	{
		js = new JsonPath(Payload.getPayload());
		purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchased amount is :: "+purchaseAmount);
	}
	
	@Test(priority=3)
	public void getAllTitles()
	{
		js = new JsonPath(Payload.getPayload());
		//totalCourses = js.getList("courses");
		for(int i=0; i<totalCourses.size(); i++)
		{
			String titles = js.getString("courses["+i+"].title");
			System.out.println("Titles are :: "+titles);
		}
		
	}
	
	@Test(priority=4)
	public void getFirstTitle()
	{
		js = new JsonPath(Payload.getPayload());
		String firstTitle = js.getString("courses[0].title");
		System.out.println("First Title is :: "+firstTitle);
	}
	
	@Test(priority=5)
	public void courseTitlesAndPrices()
	{
		js = new JsonPath(Payload.getPayload());
		//totalCourses = js.getList("courses");
		for(int i=0; i<totalCourses.size(); i++)
		{
			String titles = js.getString("courses["+i+"].title");
			System.out.println("Titles are :: "+titles);
			int prices = js.getInt("courses["+i+"].price");
			System.out.println("Prices are :: "+prices);
		}
	}
	
	@Test(priority=6)
	public void totalRPACopies()
	{
		js = new JsonPath(Payload.getPayload());
		//totalCourses = js.getList("courses");
		for(int i=0; i<totalCourses.size(); i++)
		{
			String titles = js.getString("courses["+i+"].title");
			if(titles.equalsIgnoreCase("RPA"))
			{
				int copies = js.getInt("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
	}
	
	@Test(priority=7)
	public void sumOfAllCoursesPrice()
	{
		js = new JsonPath(Payload.getPayload());
		//totalCourses = js.getList("courses");
		int sum = 0;
		for(int i=0; i<totalCourses.size(); i++)
		{
			int prices = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int total = prices*copies;
			sum = sum+total;
		}
		System.out.println(sum);
		Assert.assertEquals(sum, purchaseAmount);
	}

}
