package week5.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) throws IOException {
	
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		//testcase level
		
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a new lead in testleaf");
		test.assignCategory("sanity");
		test.assignAuthor("shri");
		
		// testcase step level
		
		test.pass("Browser Launched Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.fail("Enter Username", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("Enter Password", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		extent.flush();
		
	}

}
