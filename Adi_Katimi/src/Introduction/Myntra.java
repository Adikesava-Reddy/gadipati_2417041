package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=EAIaIQobChMIlJym_ZDIigMVlQ6DAx3d7xpvEAAYASAAEgKPQfD_BwE");
		Actions a = new Actions(driver);
        WebElement b = (driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconUser sprites-headerUser']")));
        a.moveToElement(driver.findElement(By.xpath("//input[@class='desktop-searchBar']"))).click().keyDown(Keys.SHIFT).sendKeys("hello world").doubleClick();
        a.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']"))).keyDown(Keys.SHIFT).sendKeys("hello world").doubleClick();
        a.moveToElement(b).build().perform();
        //a.moveToElement(driver.findElement(By.xpath("//input[@class='desktop-searchBar']"))).click().keyDown(Keys.SHIFT).sendKeys("hello world").doubleClick();
        //a.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']"))).click().keyDown(Keys.SHIFT).sendKeys("hello world").doubleClick();

	}

}
