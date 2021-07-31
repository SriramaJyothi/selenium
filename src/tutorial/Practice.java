package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	private static Select country;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("jyothi");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("srirama");
		 //driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("23/12 uppal hyd");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jyothisrirama7687@gmail.com");
		 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("84998760987");
		 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]")).click();
		 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		driver.findElement(By.xpath("//input[@value='Hockey']")).click();
	//driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]")).click();
	//driver.findElement(By.tagName("")).click();
	//driver.findElement(By.linkText("Dutch")).click();

		WebElement drop=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select select=new Select(drop);
		select.selectByValue("2000");
		WebElement yea=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select1=new Select(yea);
		select1.selectByVisibleText("March");
		WebElement ye=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select select2=new Select(ye);
		select2.selectByValue("12");
	WebElement skill=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[1]/select[1]"));
		Select select3=new Select(skill);
		select3.selectByVisibleText("C");
		
		WebElement down=driver.findElement(By.xpath("//select[@ng-model='country']"));
		Select select4=new Select(down);
		select4.selectByVisibleText("China");
		
		//
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/span[1]/span[1]/span[2]/ul[1]/li[4]")).click();
		
		
		 driver.findElement(By.id("firstpassword")).sendKeys("84998760987");
		 driver.findElement(By.id("secondpassword")).sendKeys("84998760987");
		 WebElement add= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
		add.sendKeys("3/24 uppal hyd pin500010");
		 
		 //driver.findElement(By.id("submitbtn")).click();
		
		 
		 
		 
		 
		 
	}

		
	}


