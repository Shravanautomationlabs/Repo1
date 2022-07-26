package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004_Annotations1 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void chromeSetup() {
		
		WebDriverManager.chromedriver().setup();
	
	System.out.println("before test");
	}
	
	@Test
	public void flipcart() {
		
	    driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr425507");
		driver.findElement(By.name("password")).sendKeys("jahEjEt");
		driver.findElement(By.name("btnLogin")).click();
		
		String sss = driver.getTitle();
		System.out.println("Get Title:" + sss);
		
	Assert.assertEquals("Guru99 Bank Manager HomePage", sss);
	System.out.println("test flipcart");
	}
	
	@AfterTest
	public void closeTheBrowserSession() {
		driver.quit();
		System.out.println("after test");
	}
	
}
