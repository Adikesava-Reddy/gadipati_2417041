package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonlogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']"));
		
		a.moveToElement(driver.findElement(By.xpath("//input[@class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("login").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		

	}

}
