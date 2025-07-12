package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("span[data-icon='chevron']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9741784497");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(9000);
		driver.findElement(By.className("_ak8l")).click();
		
		

	}

}
