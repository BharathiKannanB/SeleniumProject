package testcasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesPOM.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	
	@BeforeTest()
	public void setData() {
		testCaseName = "TC_CreateLead";
		testCaseDesc = "Create a New Lead";
		category = "smoke";
		author = "shri";
		excelFileName ="CreateLead";
	}
	
	@Test(dataProvider ="setData")
	public void createLead(String fName, String lName, String cName)
	{
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRM()
		.clickCLead()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompanyName(cName)
		.clickCreate()
		.verifyFirstName(fName);
	}
	
}
