package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaTest
{
	@Test(groups = "integration")
	public void YamahaLaunch()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/yamaha-bikes.html");
		Reporter.log("-----------Yamaha launched successfully-------------",true);
	}


}
