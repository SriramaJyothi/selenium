package tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.youtube.com/");
	System.out.println(driver.getTitle());
	
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
driver.navigate().refresh();	
driver.close();
}

}
