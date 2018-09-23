package week6.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class TC005_DuplicateLead extends ProjectMethods {

	@BeforeTest(groups = {"regression"})
	public void setData() {
		testCaseName = "TC_DuplicateLead";
		testCaseDesc = "Duplicate a Lead";
		category = "smoke";
		author = "shri";
	}

	@Test(groups = {"regression"}, dataProvider="duplicate")
	void duplicateLead(String mailId) throws InterruptedException{
	WebElement llink = locateElement("linktext","Leads");
	click(llink);
	WebElement flink = locateElement("linktext","Find Leads");
	click(flink);
	WebElement em = locateElement("xpath","//span[text()='Email']");
	click(em);
	WebElement ema = locateElement("xpath","//input[@name='emailAddress']");
	type(ema, mailId);
	WebElement flead = locateElement("xpath","//button[text()='Find Leads']");
	click(flead);
	Thread.sleep(5000);
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
	
	@DataProvider(name= "duplicate")
	Object[] duplicateL()
	{
		Object[] data = new Object[2];
		data[0] = "sample@gmail.com";              //we should give different values, for testing purpose giving the same values
		data[1] = "sample@gmail.com";
		return data;

	}

}
