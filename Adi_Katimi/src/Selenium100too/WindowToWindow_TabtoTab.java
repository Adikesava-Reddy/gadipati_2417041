package Selenium100too;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowToWindow_TabtoTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
//		Set<String> handle = driver.getWindowHandles();
//	Iterator<String>	it = handle.iterator();
//	
//	   String parentid = it.next();
//	   String Childid = it.next();
//	   
//	   driver.switchTo().window(Childid);
//	   driver.get("https://rahulshettyacademy.com/");
//	  String coursename = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
//	   driver.switchTo().window(parentid);
//	   driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    String product=driver.findElement(By.cssSelector("span[class='a-truncate']")).getText();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle = driver.getWindowHandles();
	    Iterator<String> it =handle.iterator();
	    String  parentid = it.next();
	    String  childid = it.next();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.cssSelector("input[class='Pke_EE']")).sendKeys(product);
	    
		
  
		
		
		

	}

}
