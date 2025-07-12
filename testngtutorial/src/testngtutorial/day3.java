package testngtutorial;

import org.testng.annotations.Test;

public class day3 {

	@Test
	public void demo7()
	{
		System.out.println("hello all");
	}
	@Test(groups={"smoke"})
	public void demo8()
	{
		System.out.println("Vachhava inttiki");
	}
	@Test
	public void demo9()
	{
		System.out.println("vellana roomki");
	}
}
