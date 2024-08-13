package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {
	@Test(groups = "integration")
	public void BajajLaunch()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bajajauto.com/booking/pulsar-ns400");
		Reporter.log("-----------Bajaj launched successfully-------------",true);

	}

}
