package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gamil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoth\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
 
 WebElement identifier= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
 identifier.sendKeys("jyothisrirama768@gmail.com");

Actions action=new Actions(driver);
action.moveToElement(identifier).perform();
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/span/span"));

 
 
 
 //driver.close();


	}

	private static void perform() {
		// TODO Auto-generated method stub
		
	}

}
