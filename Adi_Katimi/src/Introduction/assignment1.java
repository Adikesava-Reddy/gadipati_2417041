package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.name("name")).sendKeys("ADIKESAVA");
//		driver.findElement(By.name("email")).sendKeys("adikesava.2111@gmail.com");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ch!nn@132645");
//		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//		driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("male");
//		driver.findElement(By.id("inlineRadio1")).click();
//		driver.findElement(By.name("bday")).sendKeys("01-01-2024");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String a = driver.getTitle();
		if(a.equals("Google")) {
		    	System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		String b = driver.getCurrentUrl();
		if(b.equals("https://www.google.com/")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
