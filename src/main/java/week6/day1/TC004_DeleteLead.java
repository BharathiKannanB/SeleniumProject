package week6.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethodsOld.SeMethods;

public class TC004_DeleteLead extends ProjectMethods {

	@BeforeTest(groups = {"sanity"}, dependsOnGroups= {"smoke"})
	public void setData() {
		testCaseName = "TC_DeleteLead";
		testCaseDesc = "Delete a Lead";
		category = "smoke";
		author = "shri";
	}
	
	@Test(groups = {"sanity"}, dataProvider = "delete")
	void deleteLead(String phnNo) throws InterruptedException{
	WebElement llink = locateElement("linktext","Leads");
	click(llink);
	WebElement flink = locateElement("linktext","Find Leads");
	click(flink);	
	WebElement phn = locateElement("xpath","(//span[@class='x-tab-strip-text '])[2]");
	click(phn);	
	WebElement phni = locateElement("name", "phoneNumber");
	type(phni, phnNo);
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
	
	@DataProvider(name= "delete")
	Object[] deleteL()
	{
		Object[] data = new Object[3];
		data[0] = "987654321";              //we should give different values, for testing purpose giving the same values
		data[1] = "987654321";
		data[2] = "987654321";
		return data;

	}

}
