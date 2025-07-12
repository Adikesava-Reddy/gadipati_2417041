package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
//		System.out.println(driver.findElements(By.tagName("a")).size());
//		WebElement footerdriver = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
//		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//		WebElement abc = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		System.out.println(abc.findElements(By.tagName("a")).size());

//		for (int i = 1; i < abc.findElements(By.tagName("a")).size(); i++)
//
//		{
//			String xyz = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			abc.findElements(By.tagName("a")).get(i).sendKeys(xyz);
//			Thread.sleep(5000);
//		}
//		Set<String> mno = driver.getWindowHandles();
//		Iterator<String> it = mno.iterator();
//		while (it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
		
		}

	}

//}
