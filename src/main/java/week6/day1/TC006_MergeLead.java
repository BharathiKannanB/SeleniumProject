package week6.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class TC006_MergeLead extends ProjectMethods {
	
	@BeforeTest(groups = {"regression"})
	public void setData() {
		testCaseName = "TC_MergeLead";
		testCaseDesc = "Edit a Lead";
		category = "smoke";
		author = "shri";
	}
	@Test(dataProvider="merge")
	void mergeLead(String fName, String id1, String id2) throws InterruptedException{
	WebElement llink = locateElement("linktext","Leads");
	click(llink);
	WebElement mlink = locateElement("linktext","Merge Leads");
	click(mlink);
	WebElement em = locateElement("xpath","//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a");
	clickWithNoSnap(em);
	switchToWindow(1);
	WebElement name = locateElement("xpath","(//div[@class='x-form-element'])[2]/input");
	type(name, fName);
	WebElement fclick = locateElement("xpath","//button[text()='Find Leads']");
	click(fclick);
	WebElement lead = locateElement("xpath","//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
	clickWithNoSnap(lead);	
	switchToWindow(0);
	WebElement combo = locateElement("xpath","//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a");
	clickWithNoSnap(combo);
	switchToWindow(1);
	WebElement id = locateElement("xpath","//div[@class='x-form-element']/input");
	type(id, id1);
	WebElement fls = locateElement("xpath","//button[text()='Find Leads']");
	click(fls);
	Thread.sleep(5000);
	WebElement lead1 = locateElement("xpath","//table[@class='x-grid3-row-table']/tbody/tr/td/div/a");
	clickWithNoSnap(lead1);
	switchToWindow(0);
	WebElement dang = locateElement("class", "buttonDangerous");
	click(dang);
	acceptAlert();
	WebElement leads = locateElement("linktext", "Find Leads");
	click(leads);
	WebElement leadi = locateElement("xpath","//div[@style='padding-left:155px']/input");
	type(leadi, id2);
	WebElement fclick1 = locateElement("xpath","//button[text()='Find Leads']");
	click(fclick1);
	WebElement info = locateElement("class", "x-paging-info");
	explicitWait(20, info);
	verifyExactText(info, "No records to display");
	
	}

	@DataProvider(name= "merge")
	Object[][] data1Prov() {
		Object[][] data = new Object[2][3];
		data[0][0] = "Bharathi";
		data[0][1] = "10463";
		data[0][2] = "10396";
		data[1][0] = "Bharathi";
		data[1][1] = "10455";
		data[1][2] = "10396";
		return data;
	}
	
}
