package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	
	}

}
