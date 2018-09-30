package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLeadsPage extends CreateLeadPage {

	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Find Leads")
	WebElement eleFLeads;
	public MyFindLeadsPage clickFLeads()
	{
		click(eleFLeads);
		return new MyFindLeadsPage();
	}
}
