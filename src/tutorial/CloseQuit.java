package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C://Users/jyoth/Downloads/geckodriver-v0.29.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://demo.automationtesting.in/windows.html");
		driver.get("https://www.facebook.com/");

		

	}

}
