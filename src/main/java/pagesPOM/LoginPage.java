package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement eleUName;
	public LoginPage enterUserName(String uName) {
		type(eleUName, uName);
		return this;
	}
	
	@FindBy(id = "password")
	WebElement elePswd;
	public LoginPage enterPassword(String pass)
	{
		type(elePswd, pass);
		return this;
	}
	
	@FindBy(className = "decorativeSubmit")
	WebElement eleLogin;
	public HomePage clickLogin()
	{
		click(eleLogin);
		return new HomePage();
	}
	
}
