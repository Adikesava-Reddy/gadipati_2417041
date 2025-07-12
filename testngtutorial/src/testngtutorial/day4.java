package testngtutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class day4 {
	
	@AfterTest
	public void demo10()
	{
		System.out.println("how are you");
	}
	@Test
	public void demo11(String urlname)
	{
		System.out.println("all good ?");
		System.out.println(urlname);
	}
	@BeforeClass
	public void demo12()
	{
		System.out.println("yeah fine wt abt you");
	}
	@BeforeTest(groups= {"smoke"})
	public void demo13()
	{
		System.out.println("exam done ?");
	}
}