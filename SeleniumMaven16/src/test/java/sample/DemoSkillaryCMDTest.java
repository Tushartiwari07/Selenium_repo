package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoSkillaryCMDTest 
{
	@Test
	public void login()
	{
		String URL = System.getProperty("url");
		String EMAIL = System.getProperty("email");
		String PASSWORD = System.getProperty("pwd");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Reporter.log(URL + " launched successfully");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("last")).click();
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","Admin login Successfull");
	}

}
