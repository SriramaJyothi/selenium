package tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Upload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //driver.findElement(By.xpath("//body/header/nav[@class='navbar navbar-inverse']/div[@class='container']/div[@class='navbar-collapse collapse navbar-right']/ul[@class='nav navbar-nav']/li[9]/a[1]")).click();
		 //driver.findElement(By.linkText("//input[@type='file']")).click();
		// driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
		 //driver.findElement(By.xpath("//input[@type='file']")).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\upload\\Capture2.PNG"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		 
		 
		 
		 
		/* String imagesFilepath="C:\\Users\\jyoth\\OneDrive\\Desktop\\upload\\";
		 String inputFilepath="C:\\Users\\jyoth\\OneDrive\\Desktop\\upload\\";
		 Screen s=new Screen();
		 Pattern fileInputTextbox=new Pattern(imagesFilepath+"Capture.PNG");
		 Pattern openButton=new Pattern(imagesFilepath+"Capture1.PNG");
		 Thread.sleep(2000);
		 s.wait(fileInputTextbox,20);
		 s.type(fileInputTextbox,inputFilepath+"Capture3.jpg");
		 s.click(openButton);*/
		 
		 
	}

}
