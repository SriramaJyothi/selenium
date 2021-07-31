package tutorial;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download {


		
		public static void main(String[] args) throws IOException, InterruptedException {
			   // TODO Auto-generated method stub
			 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize(); //always write wait code after this
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   driver.get("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Bing-Monster_Main_Brand_Web_YS-Search-Monster.com+Other_E-monsterindia%20com-desktop-brand-CPC-45089193&utm_campaign=IN_Acq_SEM-Bing-Monster_Main_Brand_Web_YS-Search-Monster.com+Other_E-monsterindia%20com&utm_medium=SEM&utm_source=Bing-Search-CPC&utm_term=SEM_monsterindia%20com&msclkid=f36032297cc01d5b500352a3ed6f0fff"); //Testing webpage
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit wait
			 
			   JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
			   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
			   Thread.sleep(3000);
			   //WebDriverWait wait=new WebDriverWait(driver,10);
				// wait.until(ExpectedConditions.visibilityOfElementLocated(
				driver.findElement( By.xpath("//input[@id='file-upload']"))
			   // FILE UPLOADING USING SENDKEYS ....
			 
			   //WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
			   //click on ‘Choose file’ to upload the desired file
			   .sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\upload\\potti resume1.txt"); //Uploading the file using sendKeys
			   System.out.println("File is Uploaded Successfully");
			 
			   }
	}

