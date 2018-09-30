package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyFindLeadsPage extends ProjectMethods {
	
	public MyFindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@style='padding-left:155px']/input")
	WebElement eleLeadId;
	public MyFindLeadsPage enterLeadId(String leadId)
	{
		type(eleLeadId, leadId);
		return this;
	}
	
	@FindBy(xpath = "//div[@style='padding-left:155px']/input")
	WebElement eleFLeadsB;
	public MyFindLeadsPage clickFindLeadsB() throws InterruptedException
	{
		click(eleFLeadsB);
		Thread.sleep(5000);
		return this;
	}
	
	@FindBy(xpath = "//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")
	WebElement eleClickLeadId;
	public ViewLeadPage clickLeadId() throws InterruptedException
	{
		clickWithNoSnap(eleClickLeadId);
		Thread.sleep(5000);
		return new ViewLeadPage();
	}
	
	
	

}
