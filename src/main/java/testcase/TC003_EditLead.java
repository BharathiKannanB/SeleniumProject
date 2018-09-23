package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethodsOld.SeMethods;

public class TC003_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC_EditLead";
		testCaseDesc = "Edit a Lead";
		category = "smoke";
		author = "shri";
	}
		@Test(enabled = false, priority = 3)	
		void editLead() throws InterruptedException{
		WebElement llink = locateElement("linktext","Leads");
		click(llink);
		WebElement flink = locateElement("linktext","Find Leads");
		click(flink);		
		WebElement lead1 = locateElement("xpath","//div[@style='padding-left:155px']/input");
		type(lead1, "10115");
		WebElement lbut = locateElement("xpath","//button[text()='Find Leads']");
		click(lbut);
		Thread.sleep(5000);
		WebElement first = locateElement("xpath","//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
		Thread.sleep(5000);
		clickWithNoSnap(first);
		verifyTitle("View Lead | opentaps CRM");
		WebElement editb = locateElement("xpath","//a[text()='Edit']");
		click(editb);
		WebElement comp = locateElement("id","updateLeadForm_companyName");
		clear(comp);
		type(comp, "Aon");
		WebElement bupd = locateElement("xpath","//input[@value='Update']");
		click(bupd);
		WebElement cname = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(cname,"Aon");
		

	}

}
