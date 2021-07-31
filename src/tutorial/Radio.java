package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://exampundit.in/railway-exam-study-material-pdf/");
		//driver.findElement(By.xpath("//body/div/div/div/div/div/div[@role='navigation']/div/ul/li[5]/a[1]")).click();
		//driver.findElement(By.xpath("//a[@href='https://pdf.exampundit.in/']//strong")).click();
		//Select select = new Select(pundit);
		driver.get("https://www.bankexamstoday.com/2015/08/banking-awareness-questions-pdf.html");
driver.findElement(By.xpath("//body/div[@class='blogouter-wrapper']/div[@class='page-header section']/div[@class='widget HTML']/div[@class='widget-content']/div[@class='tm-menu']/div[@class='ct-wrapper menu-wrap']/div[@class='menu']/ul[@role='menubar']/li[7]/a[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[2]/a[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	driver.findElement(By.xpath("/html/body/pdf-viewer//viewer-pdf-toolbar-new//div/div[3]/viewer-download-controls//cr-icon-button//div/iron-icon")).click();
	
		
	}
}
