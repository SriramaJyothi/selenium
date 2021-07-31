package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//body/header/nav[@class='navbar navbar-inverse']/div[@class='container']/div[@class='navbar-collapse collapse navbar-right']/ul[@class='nav navbar-nav']/li[9]/a[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();
		//driver.findElement(By.id("textbox")).sendKeys("testing download");
		//driver.findElement(By.id("createTxt")).click();
		//driver.findElement(By.id("link-to-download")).click();
		driver.findElement(By.id("pdfbox")).sendKeys("testing download");

		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		
	}
	}
//textarea rows="3" class="form-control ng-pristine ng-valid ng-touched" ng-model="Adress" style="" xpath="1"></textarea>
//<textarea id="textbox" class="form-control" rows="5" xpath="1"></textarea>
