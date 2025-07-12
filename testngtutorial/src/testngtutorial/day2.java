package testngtutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day2 {

@Test(groups= {"somke"})
	
	public void demo4()
	{
		System.out.println("chinnakodipalli");
     }
     @Parameters({"URL"})
     @Test
     public void demo5(String urlname)
     {
    	 System.out.println("good morning");
    	 System.out.println(urlname);
     }
     @Test
     public void demo6()
     {
    	 System.out.println("good night");
     }
}
