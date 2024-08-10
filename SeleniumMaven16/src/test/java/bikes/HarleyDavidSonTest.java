package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidSonTest 
{
	@Test(groups = "regression")
	public void HarleyLaunch()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("-----------HarleyDavidSon launched successfully-------------",true);
	}

}
