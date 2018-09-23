package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class TC002_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC_CreateLead";
		testCaseDesc = "Create a New Lead";
		category = "smoke";
		author = "shri";
	}
	
	@Test(invocationCount =2,priority=1)	
	void createLead(){
	WebElement cld = locateElement("linktext","Create Lead");
	click(cld);
	WebElement cname = locateElement("id", "createLeadForm_companyName");
	type(cname, "wipro");
	WebElement fname = locateElement("id", "createLeadForm_firstName");
	type(fname, "Bharathi");
	WebElement lname = locateElement("id", "createLeadForm_lastName");
	type(lname, "Kannan");
	WebElement cnamel = locateElement("id", "createLeadForm_firstNameLocal");
	type(cnamel, "Shri");
	WebElement fnamel = locateElement("id", "createLeadForm_lastNameLocal");
	type(fnamel, "sss");
	WebElement lnamel = locateElement("id", "createLeadForm_personalTitle");
	type(lnamel, "Dear");
	WebElement dsour = locateElement("id", "createLeadForm_dataSourceId");
	selectDropDownUsingText(dsour, "Direct Mail");
	WebElement prof = locateElement("id", "createLeadForm_generalProfTitle");
	type(prof, "Mr");
	WebElement rev = locateElement("id", "createLeadForm_annualRevenue");
	type(rev, "50 Lakhs");
	WebElement ind = locateElement("id", "createLeadForm_industryEnumId");
	selectDropDownUsingIndex(ind, 2);
	WebElement ownr = locateElement("id", "createLeadForm_ownershipEnumId");
	selectDropDownUsingValue(ownr, "OWN_PUBLIC_CORP");	
	WebElement sic = locateElement("id", "createLeadForm_sicCode");
	type(sic, "SIC sample");
	WebElement desc = locateElement("id", "createLeadForm_description");
	type(desc, "SIC description");
	WebElement imp = locateElement("id", "createLeadForm_importantNote");
	type(imp, "Important Note");
	WebElement code = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
	type(code, "91");
	WebElement area = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
	type(area, "044");
	WebElement ext = locateElement("id", "createLeadForm_primaryPhoneExtension");
	type(ext, "5678");
	WebElement dep = locateElement("id", "createLeadForm_departmentName");
	type(dep, "IT");
	WebElement curr = locateElement("id", "createLeadForm_currencyUomId");
	selectDropDownUsingText(curr, "INR - Indian Rupee");
	
	WebElement tick = locateElement("id", "createLeadForm_tickerSymbol");
	type(tick, "Sample");
	WebElement ask = locateElement("id", "createLeadForm_primaryPhoneAskForName");
	type(ask, "Kokkikumar");
	WebElement gen = locateElement("id", "createLeadForm_generalToName");
	type(gen, "Maari");
	WebElement gadd = locateElement("id", "createLeadForm_generalAddress1");
	type(gadd, "Vivekanandhar Theru");
	WebElement gaddr = locateElement("id", "createLeadForm_generalAddress2");
	type(gaddr, "Dubai Kurukku Sandhu");
	WebElement gcity = locateElement("id", "createLeadForm_generalCity");
	type(gcity, "Abudhabi");
	WebElement ctry = locateElement("id", "createLeadForm_generalCountryGeoId");
	selectDropDownUsingText(ctry, "India");
	WebElement state = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
	explicitWait(20, state);
	selectDropDownUsingValue(state, "IN-TN");
	WebElement post = locateElement("id", "createLeadForm_generalPostalCode");
	type(post, "654321");
	WebElement pext = locateElement("id", "createLeadForm_generalPostalCodeExt");
	type(pext, "12");
	WebElement camp = locateElement("id", "createLeadForm_marketingCampaignId");
	selectDropDownUsingIndex(camp, 7);
	WebElement phone = locateElement("id", "createLeadForm_primaryPhoneNumber");
	type(phone, "987654321");
	WebElement mail = locateElement("id", "createLeadForm_primaryEmail");
	type(mail, "sample@gmail.com");
	WebElement submit = locateElement("class", "smallSubmit");
	click(submit);
	WebElement vname = locateElement("id", "viewLead_firstName_sp");
	verifyExactText(vname, "Bharathi");
	
	
	}

}
