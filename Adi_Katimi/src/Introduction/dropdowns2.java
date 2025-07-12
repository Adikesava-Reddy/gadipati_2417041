package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(700);
		driver.findElement(By.cssSelector("span[id='hrefIncChd']")).click();
		
		for(int i=0; i<5; i++) {
			driver.findElement(By.cssSelector("span[id='hrefIncChd']")).click();
			}
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
