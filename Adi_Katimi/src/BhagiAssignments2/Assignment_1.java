package BhagiAssignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		//click on the check-box, verify that check-box webelement is visible
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		WebElement ab=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    boolean xy=ab.isDisplayed();
		System.out.println(xy);
		
		//after clicking on the remove , verify that check-box webelement is not visible
		driver.findElement(By.xpath("//button[@type='button'])[1]")).click();
		boolean zz=ab.isEnabled();
		System.out.println(zz);
		
		
		
		
		

	}

}
