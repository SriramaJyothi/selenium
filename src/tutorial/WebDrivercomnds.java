package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivercomnds {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://listen.callcap.com/login.cfm");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("html/body/div/form/div[1]/h1")).getText();
		driver.close();

		
		
	}
}
