package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleUCName;
	public EditLeadPage enterUpdatedCName(String updatedCName) {
		
		clear(eleUCName);
		type(eleUCName, updatedCName);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@value='Update']" )
	WebElement eleUpdateB;
	public ViewLeadPage clickUpdateB() {
    click(eleUpdateB);
    return new ViewLeadPage();
		
	}
}
