package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.id("okayBtn"))));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
        driver.findElement(By.id("okayBtn")).click();
       WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
       Select dropdown = new Select(options);
       dropdown.selectByValue("consult");
        //driver.findElement(By.xpath("//select[@class='form-control']")).click();
        //driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

	}

}
