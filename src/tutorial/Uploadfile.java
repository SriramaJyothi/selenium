package tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\eclipse-workspace\\automationPractice\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//body/header/nav[@class='navbar navbar-inverse']/div[@class='container']/div[@class='navbar-collapse collapse navbar-right']/ul[@class='nav navbar-nav']/li[9]/a[1]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='File Upload']")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\upload\\potti resume1.txt");//Uploading the file using sendKeys
		   //browser.click();
		   Thread.sleep(3000);
		   System.out.println("File is Uploaded Successfully");
		 
	}

}
