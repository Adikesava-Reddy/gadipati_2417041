package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class crickbuzz {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/109589/msa-vs-ajmb-34th-match-abu-dhabi-t10-league-2024");
		Thread.sleep(5000);
		driver.findElement(By.id("cb-plus-user-icon")).click();
		driver.findElement(By.id("cb-user-email-input")).sendKeys("9182003517");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
	    driver.findElement(By.id("recaptcha-anchor")).click();
		driver.findElement(By.cssSelector("button.cb-col-100 cb-more-btn cb-font-14 cb-continue-button"));
		
	
	}

}
