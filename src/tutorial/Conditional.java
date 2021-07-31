package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Conditional {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/label/input")).click();
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		if(email.isDisplayed () && email.isEnabled())
		
		{
			email.sendKeys("jyothi@gmail");
		}
		
		if(password.isDisplayed() && password.isEnabled() )
		{
			password.sendKeys("qweejjb");
		
		}
		 //driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		 
		 //driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
		
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("label._58mt")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("label._58mt")).isSelected());
		
		
		//if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected()==false);
			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
		if(driver.findElement(By.cssSelector("label._58mt")).isSelected()==false);
		driver.findElement(By.cssSelector("label._58mt")).click();
		
		
		
	driver.findElement(By.name("firstname")).sendKeys("srirama");;
	driver.findElement(By.name("lastname")).sendKeys("jyothi");
	driver.findElement(By.name("reg_email__")).sendKeys("jyoyhtj@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jyoyhtj@gmail.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("tyyy677889");
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).clear();
	
//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
	
	///////////////////////////////dropdown///////////////////////////////////////////////////////////////
	//driver.findElement(By.xpath("//a[@title='Hindi']")).click();
	WebElement ddown=driver.findElement(By.name("birthday_day"));
	
	Select select=new Select(ddown);
	select.selectByValue("16");
	
	WebElement ddrop=driver.findElement(By.name("birthday_month"));
	Select select1=new Select(ddrop);
	select1.selectByValue("11");
	
	WebElement dd=driver.findElement(By.name("birthday_year"));
	Select select2=new Select(dd);
	select2.selectByValue("2000");
///////////	/////////////radio buttons//////////////////////////////////////////////////////////
	//driver.findElement(By.xpath("//input[@value='1']")).click();
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	
	WebElement custom=driver.findElement(By.name("preferred_pronoun"));
	Select select3 =new Select(custom);
	select3.selectByValue("1");
	select3.selectByValue("2");
	select3.selectByValue("6");
	driver.findElement(By.name("custom_gender")).sendKeys("none");
	
	driver.findElement(By.xpath("//body/div/div/div[@role='main']/div/div/div/div/div/div/form[@method='post']/div/div/a[@title='Click for more information']/i[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[name=websubmit]")).click();
	
		
	}

}
