package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;

public class Calender {
	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Datepicker.html");
		 driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']")).click();
		 WebElement year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		 WebElement date=driver.findElement(By.xpath("//tbody/tr[4]/td[6]"));
		 Actions act=new Actions(driver);
		 act.moveToElement(year).build().perform();
         act.moveToElement(date).click().build().perform();
       ///////////////////////////////////////////////////////////////////////////////////////
         driver.findElement(By.xpath("//input[@class='form-control is-datepick']")).click();
		 WebElement year1=driver.findElement(By.xpath("//select[@title='Change the year']"));
		 
		 

		 Select select1=new Select(year1);
		 select1.selectByIndex(5);
		 WebElement mth=driver.findElement(By.xpath("//select[@title='Change the month']"));
			Select select2=new Select(mth);
			select2.selectByIndex(5);			
			WebElement date1=driver.findElement(By.linkText("25"));

		 /*act.moveToElement(year1).build().perform();
		 act.moveToElement(month).build().perform();*/
         act.moveToElement(date1).click().build().perform();
		 
	}
	
}
