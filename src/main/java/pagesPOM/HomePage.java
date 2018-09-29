package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {
	
	HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement crmLink;
	public MyLoginPage clickCRM()
	{
		click(crmLink);
		return new MyLoginPage();
	}

}
