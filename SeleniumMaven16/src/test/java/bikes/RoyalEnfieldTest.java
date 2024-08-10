package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfieldTest 
{
	@Test(groups = "regression")
	public void launchRoyalEnfield()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("-------------------------------RoyalEnfield launched successfully----------------------",true);
	}

}
