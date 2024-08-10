package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParametersTest {
	@Test
	public void receiveData() {
		String URL = System.getProperty("url");
		String EMAIL = System.getProperty("email");
		String PASSWORD = System.getProperty("pwd");
		Reporter.log(URL, true);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Reporter.log(URL + " launched successfully");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		Reporter.log("Data sent Successfully",true );
		

	}

}
