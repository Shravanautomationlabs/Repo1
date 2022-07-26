package softassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	
	WebDriver driver = null;
	@Test
	public void login() {
		
	    driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr425507");
		driver.findElement(By.name("password")).sendKeys("jahEjEt");
		driver.findElement(By.name("btnLogin")).click();
		
		String sss = driver.getTitle();
		System.out.println("Get Title:" + sss);
		
	Assert.assertEquals("Guru99 Bank Manager HomePage1", sss);//due to hard assertion script can't execute further steps
    driver.close();
	}

}
