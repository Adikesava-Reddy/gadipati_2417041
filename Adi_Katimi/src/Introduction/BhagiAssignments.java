package Introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BhagiAssignments {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/adike/OneDrive/Desktop/Chrome_Driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://the-internet.herokuapp.com/");
		//Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@class='VGMdYn'])[1]")).click();
//		driver.findElement(By.id("input_comp-kaoxkn4j")).sendKeys("CHINNA");
//		driver.findElement(By.id("input_comp-kaoxkn4o")).sendKeys("REDDY");
//		driver.findElement(By.id("input_comp-kaoxkn4s")).sendKeys("adikesavareddy6007@gmail.com");
//		driver.findElement(By.id("input_comp-kaoxkn4w")).sendKeys("#Ida_Kat3517");
//		driver.findElement(By.id("input_comp-kaoxr1ae")).sendKeys("9182003517");
//		driver.findElement(By.id("input_comp-karpvdv0")).sendKeys("BANGALORE");
//		driver.findElement(By.xpath("(//span[@class='l7_2fn wixui-button__label'])[3]")).click();
//		driver.findElement(By.id("recaptcha-anchor")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@role='presentation'][2]")).click();
//		driver.findElement(By.id("recaptcha-demo-submit")).click();
//		String a = "Verification Success... Hooray!";
//		if(a.equals("Verification Success... Hooray!")) {
//			
//			System.out.println("yes");
//			
//		}
//		else {
//			
//			System.out.println("no");
// Write a script to open a website with a form, fill in text fields, select options from dropdowns, and click a submit button.
//		driver.findElement(By.id("firstName")).sendKeys("CHINNA");
//		driver.findElement(By.id("lastName")).sendKeys("REDDY");
//		driver.findElement(By.id("userEmail")).sendKeys("adikesavareddy6007@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
//		driver.findElement(By.id("userNumber")).sendKeys("9182003517");
		//driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--007 react-datepicker__day--selected react-datepicker__day--today']")).click();
		//driver.findElement(By.cssSelector("div[class='subjects-auto-complete__control css-yk16xz-control']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='subjectsContainer']/div")).sendKeys("abcd");
		//driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
//		driver.findElement(By.id("currentAddress")).sendKeys("jkcbkjdsbckhifinc gncgycndsjncnk cas");
//		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]")).click();
		
		//just give the details
//		driver.switchTo().frame(driver.findElement(By.id("firstFr")));
//		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("CHINNA");
//		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("REDDY");
//		System.out.println(driver.findElement(By.xpath("//div[@class='content mt-4']")).getText());		
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='innerframe']")));
//		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("adikesava2111@gmail.com");
		
		//Find all the links on a webpage and print their text and URLs.
		
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 List<WebElement> ab = driver.findElements(By.tagName("a"));
		 for(WebElement cd:ab){
		 String	xy = cd.getText();
//		 System.out.println(xy);
	     String rr= cd.getAttribute("href");
	     System.out.println(rr + " " + xy);
		 
			 			 
			
			 
		 }
		}
		

	}


