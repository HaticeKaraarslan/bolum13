import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).click();
	
		Thread.sleep(1000L);
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		//Ajax implementation
		//javasciptExecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script="document.getElementById(\"fromPlaceName\").value;";
		
		String txt=(String) js.executeScript(script);
		System.out.println(txt);
		
		
		
		
		driver.close();


	}

}
