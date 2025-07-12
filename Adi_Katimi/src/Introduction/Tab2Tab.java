package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab2Tab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Actions abc = new Actions(driver);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		
		
		
		


	}

}
