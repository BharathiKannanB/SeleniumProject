package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class TC005_DuplicateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC_DuplicateLead";
		testCaseDesc = "Duplicate a Lead";
		category = "smoke";
		author = "shri";
	}

	@Test	
	void duplicateLead(){
	WebElement llink = locateElement("linktext","Leads");
	click(llink);
	WebElement flink = locateElement("linktext","Find Leads");
	click(flink);
	WebElement em = locateElement("xpath","//span[text()='Email']");
	click(em);
	WebElement ema = locateElement("xpath","//input[@name='emailAddress']");
	type(ema, "sample@gmail.com");
	WebElement flead = locateElement("xpath","//button[text()='Find Leads']");
	click(flead);
	WebElement lead5 = locateElement("xpath","(//table[@class='x-grid3-row-table']//tr//div)[3]/a");
	String lead1 = getText(lead5);
	clickWithNoSnap(lead5);
	WebElement dupl = locateElement("linktext","Duplicate Lead");
	click(dupl);
	verifyTitle("Duplicate Lead");
	WebElement create = locateElement("xpath","//input[@value='Create Lead']");
	click(create);
	WebElement fname = locateElement("id", "viewLead_firstName_sp");
	verifyExactText(fname, lead1);
	
	
	
	}

}
