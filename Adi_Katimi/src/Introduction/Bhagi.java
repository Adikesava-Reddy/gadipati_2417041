package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bhagi {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/ChromeDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.className("nav-line-2")).click();
        driver.findElement(By.className("nav-action-inner")).click();
		
	}

		
}
