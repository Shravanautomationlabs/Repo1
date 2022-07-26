package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_002_Login_Test {
	
	@Test
	public void validlogin() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr418100");
		driver.findElement(By.name("password")).sendKeys("sAterYt");
		driver.findElement(By.name("btnLogin")).click();
		
		String sss = driver.getTitle();
		
		String aaa = driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
		System.out.println("Get Title:" + sss);
		
		
		
	Assert.assertEquals(aaa, "Customer Registered Successfully!!!']");
		
	}

}
