package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    //Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); 
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//to get the all number of check boxes 
		driver.findElement(By.cssSelector("input[type='checkbox']")).getSize();
		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
	}

}
