package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataTest {
	@Test(groups = "smoke")
	public void launchTata()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		Reporter.log("--------------Tata launched successfully------------------",true);
	
	}

}
