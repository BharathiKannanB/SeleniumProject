package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethodsOld.SeMethods;

public class TC004_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC_DeleteLead";
		testCaseDesc = "Delete a Lead";
		category = "smoke";
		author = "shri";
	}
	
	@Test(dependsOnMethods = {"testcase.TC002_CreateLead.createLead"}, priority = 2)	
	void deleteLead() throws InterruptedException{
	WebElement llink = locateElement("linktext","Leads");
	click(llink);
	WebElement flink = locateElement("linktext","Find Leads");
	click(flink);	
	WebElement phn = locateElement("xpath","(//span[@class='x-tab-strip-text '])[2]");
	click(phn);	
	WebElement phni = locateElement("name", "phoneNumber");
	type(phni, "987654321");
	WebElement fbut = locateElement("xpath","//button[text()='Find Leads']");
	click(fbut);	
	Thread.sleep(5000);
	WebElement lead = locateElement("xpath","//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
	explicitWait(20, lead );
	String lead1 = getText(lead);
	WebElement lead2 = locateElement("xpath","//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
	click(lead2);
	WebElement button = locateElement("class", "subMenuButtonDangerous");
	click(button);
	WebElement flink1 = locateElement("linktext","Find Leads");
	click(flink1);
	WebElement del = locateElement("xpath", "//label[text()='Lead ID:']/following::input");
	type(del, lead1);
	WebElement fbut1 = locateElement("xpath","//button[text()='Find Leads']");
	click(fbut1);
	WebElement dele = locateElement("class", "x-paging-info");
	explicitWait(20, dele);
	verifyExactText(dele, "No records to display");
	
}
}
