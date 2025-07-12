package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendardropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		  
			//System.out.println("its enabled");
			//Assert.assertTrue(true);
		}
		  // else 
		{
			//Assert.assertTrue(false);
		}
		}

}
