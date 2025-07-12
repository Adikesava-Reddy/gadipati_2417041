package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/ChromeDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("sureshgadipati10@gmail.com");
		driver.findElement(By.name("password")).sendKeys("WTDS@138");
		driver.findElement(By.cssSelector("button[class=' e1ax5wel2 ew97par0 default-ltr-cache-1ovdk0m-PressableButton-StyledPressable-StyledPressable e1ff4m3w2']")).click();
		
		
	}

}
