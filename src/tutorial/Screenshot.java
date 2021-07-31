package tutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(4000);
		 FileUtils.copyFile(source,new File("C:\\Users\\jyoth\\OneDrive\\Documents\\screenshot.png"));
		 System.out.println("Screenshot is captured");
		 
	}

}
