package tutorial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tuto {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32/chromedriver.exe");
	
	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	//options.addArguments("..headless");
	
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com//");
		
	System.out.print("title of the page:"+driver.getTitle());	
	
		
		
		
	}
}
