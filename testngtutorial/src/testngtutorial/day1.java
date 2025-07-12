package testngtutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	
	public void demo1()
	{
		
		System.out.println("hello world");
		
	}
	@Test(groups= {"smoke"})
	
	public void API()
	{
		System.out.println("good bye");
	}
	@BeforeTest 
	
	public void demo3()
	{
		System.out.println("hi");
	}
}


