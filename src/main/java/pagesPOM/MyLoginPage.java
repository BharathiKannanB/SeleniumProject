package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLoginPage extends ProjectMethods {
	
	public MyLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Leads")
	WebElement eleLeads;
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
	
	@FindBy(linkText = "Create Lead")
	WebElement eleCLead;
	public CreateLeadPage clickCLead()
	{
		click(eleCLead);
		return new CreateLeadPage();
	}
	

	

}
