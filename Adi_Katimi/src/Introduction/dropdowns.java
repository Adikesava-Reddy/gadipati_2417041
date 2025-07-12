package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(500);
		for(int i=0; i<5; i++) {
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement a = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select b = new Select(a);
	    b.selectByIndex(1);
	    driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		
	}

}
