package extentRepoters;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport 
{
	@Test
	public void createReport()
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		//Step 1: Create object for ExtentSparkReporter 
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport"+time+".html");
		
		//Step 2: Create object for ExtentReports
		ExtentReports extReport=new ExtentReports();
		
		//Step 3: Attach ExtentSparkReporter to ExtentsReports
		extReport.attachReporter(spark);
		
		//Step 4: Create ExtentTest object
		ExtentTest test = extReport.createTest("createReport");
		
		//Step 5: Call log() and provide status and message
		test.log(Status.PASS,"Successfully created extendReport");
		test.log(Status.FAIL," created extendReport failed");
		test.log(Status.SKIP," created extendReport skipped");


		
		//Step 6: call flush() present in ExtentReports
		extReport.flush();

	}

}
