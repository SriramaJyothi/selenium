package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class popups {
	public static void main(String[] args) throws InterruptedException, FindFailed {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/Register.html");
	 driver.switchTo().frame(0);
	 
	driver.findElement(By.xpath("//*[@id='google_esf']")).click();
	
	
	
	
	
	}
}
