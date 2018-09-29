package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFname;
	public CreateLeadPage enterFirstName(String fName)
	{
		type(eleFname, fName);
		return this;
	}
	
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLname;
	public CreateLeadPage enterLastName(String lName)
	{
		type(eleLname, lName);
		return this;
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCname;
	public CreateLeadPage enterCompanyName(String cName)
	{
		type(eleCname, cName);
		return this;
	}
	

	@FindBy(how = How.XPATH, using = "//input[@value='Create Lead']" )
	WebElement CreateLead;
	public ViewLeadPage clickCreate() {
	//WebElement CreateLead= locateElement("xpath", "//input[@value='Create Lead']");
    click(CreateLead);
    return new ViewLeadPage();
		
	}
	
	
}
