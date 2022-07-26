package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {

	
	@Test(dataProvider = "loginData")
	public void login(String username, String password, String expectedResult) throws InterruptedException {
		
		Thread.sleep(5000);
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(4000);
	 String ss = driver.getTitle();
	 
	 Assert.assertEquals(ss, expectedResult);//executon stop here because assertion failed 
	 
	 driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	 
		driver.close();
	}

	@DataProvider
	public Object[][]loginData(){
		
		
		Object[][] tdata = {{"mngr425507","jahEjEt","Guru99 Bank Manager HomePage"}, {"","", "Guru99 Bank Manager HomePage"}};
		return tdata;
		
		
	}
	

}
