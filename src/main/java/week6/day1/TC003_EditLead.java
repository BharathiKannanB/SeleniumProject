package week6.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import wdMethods.ProjectMethods;
 
public class TC003_EditLead extends ProjectMethods {

	@BeforeTest(groups = {"sanity"}, dependsOnGroups= {"smoke"})
	public void setData() {
		testCaseName = "TC_EditLead";
		testCaseDesc = "Edit a Lead";
		category = "smoke";
		author = "shri";
	}
		@Test(groups = {"sanity"}, dataProvider = "edit")	
		void editLead(String id, String cName) throws InterruptedException{
		WebElement llink = locateElement("linktext","Leads");
		click(llink);
		WebElement flink = locateElement("linktext","Find Leads");
		click(flink);		
		WebElement lead1 = locateElement("xpath","//div[@style='padding-left:155px']/input");
		type(lead1, id);
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
		type(comp, cName);
		WebElement bupd = locateElement("xpath","//input[@value='Update']");
		click(bupd);
		WebElement cname = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(cname,cName);
		

	}
		
		@DataProvider(name= "edit")
		Object[][] editL()
		{
			Object[][] data = new Object[2][2];
			data[0][0] = "11014";
			data[0][1] = "Aon";
			data[1][0] = "11016";
			data[1][1] = "Facebook";
			return data;

		}

}
