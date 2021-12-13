package SeleniumPractice;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class ParallelExecution extends BaseTest{
	
	@Test
	public void test1()
	{
		getDriver().get("https://www.google.com/");
		System.out.println("Title is: "+getDriver().getTitle());
		System.out.println("Test1 thread id: "+Thread.currentThread().getId());
		System.out.println("Test1 execution completed");
	}
	@Test
	public void test2()
	{
		getDriver().get("https://www.google.com/");
		System.out.println("Title is: "+getDriver().getTitle());
		System.out.println("Test2 thread id: "+Thread.currentThread().getId());
		System.out.println("Test2 execution completed");
	}
	@Test
	public void test3()
	{
		getDriver().get("https://www.google.com/");
		System.out.println("Title is: "+getDriver().getTitle());
		System.out.println("Test3 thread id: "+Thread.currentThread().getId());
		System.out.println("Test3 execution completed");
	}
	@Test
	public void test4()
	{
		getDriver().get("https://www.google.com/");
		System.out.println("Title is: "+getDriver().getTitle());
		System.out.println("Test4 thread id: "+Thread.currentThread().getId());
		System.out.println("Test4 execution completed");
	}
	@Test
	public void test5()
	{
		getDriver().get("https://www.google.com/");
		System.out.println("Title is: "+getDriver().getTitle());
		System.out.println("Test5 thread id: "+Thread.currentThread().getId());
		System.out.println("Test5 execution completed");
	}

}
