package admin;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homework1 {

	WebDriver driver;

	@Before


public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

	driver = new ChromeDriver();

	driver.get("http:/www.techfios.com/ibilling/?ng=admin");

	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	
	public void logIn() {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Bank & Cash')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		
		driver.findElement(By.id("account")).sendKeys("Personal Loan");
		
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("To Buy a Car");
		
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("100000");
		
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("78654323");
		
		driver.findElement(By.xpath("//input[@type='text' and @id='contact_person' and @name='contact_person']")).sendKeys("H Z Patel");
		
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
				
	@After
	
	public void tearDown() throws InterruptedException{
		
		//if (null != driver)
		//driver.close();
	}
		
		
		
		
		
		
		
	
}
