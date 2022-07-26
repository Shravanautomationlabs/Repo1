package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependence {
	
	WebDriver driver = null;
	@Test
	public void setup() {
		
		
		WebDriverManager.chromedriver().setup();
		
		 System.out.println("I am First");
		
	}
	
	@Test(dependsOnMethods = "setup")
	public void login() {
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr425507");
		driver.findElement(By.name("password")).sendKeys("jahEjEt");
		driver.findElement(By.name("btnLogin")).click();
		
		System.out.println("I am Second");
	}
	
	
	@Test (dependsOnMethods = "login")
	public void creartNewAccount() {

	
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		
		System.out.println("I am Third");
	}
	
	@Test (dependsOnMethods = "creartNewAccount")
	public void close() {

	
		driver.close();
		
		System.out.println("I am fourth");
	}
	

}
