package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.ID, using="viewLead_firstName_sp")
	WebElement eleView;
	public ViewLeadPage verifyFirstName(String expectedText) {
		
		//WebElement FirstnameL = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(eleView,expectedText);
		return this;
	}
	
	
	
	
	public ViewLeadPage verifyPageTitle(String pageTitle) {
		verifyPageTitle(pageTitle);
		return this;
	}
	
	@FindBy(id = "//a[text()='Edit']")
	WebElement eleEditB;
	public EditLeadPage clickEditB() {
		
		click(eleEditB);
		return new EditLeadPage();
	}
	
	@FindBy(id = "viewLead_companyName_sp")
	WebElement eleFCnName;
	public ViewLeadPage verifyCompanyName(String BCName) {
		
		verifyPartialText(eleFCnName, BCName);
		return this;
	}
	
}
