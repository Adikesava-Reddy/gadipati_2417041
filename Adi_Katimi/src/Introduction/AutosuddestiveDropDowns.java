package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuddestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ba");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for( WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("Bahrain")) {
		
				option.click();
				break;
			}
		}
		
	}

}
