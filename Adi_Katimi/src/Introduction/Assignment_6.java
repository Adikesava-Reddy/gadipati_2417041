package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption3")).click();
		String abc =driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(driver.findElement(By.cssSelector("label[for='honda']")).getText());
		WebElement xyz = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(xyz);
		s.selectByVisibleText(abc);
		driver.findElement(By.id("name")).sendKeys(abc);
		driver.findElement(By.id("alertbtn")).click();
	    String ghj =  driver.switchTo().alert().getText();
	    if(ghj.contains(abc)) {
	    	
	    	System.out.println("Alert message success");
	    	
	    }
	    else
	    
	    	System.out.println("Something wrong with execution");
		

	}

}
