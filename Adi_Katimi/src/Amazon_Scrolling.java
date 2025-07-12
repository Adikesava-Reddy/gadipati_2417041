import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://qaclickacademy.com/practice.php");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
		try{
			driver.get("http://qaclickacademy.com/practice.php");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
		}
		catch(ScriptTimeoutException A){
			
			System.out.println(A.toString());
			
		}
			finally {
				System.err.println("hello world");
		}
	}
	
}




