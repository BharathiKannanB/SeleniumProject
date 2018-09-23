package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day2.ExcelData;

public class ProjectMethods extends SeMethods{
	@BeforeSuite(groups= {"common"})
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass(groups= {"common"})
	public void beforeClass() {
		startTestCase();
	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod(groups= {"common"})
	public void login(String url, String username, String password) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linktext","CRM/SFA");
		click(eleCRM);
	}
	@AfterMethod(groups= {"common"})
	public void closeApp() {
		closeBrowser();
	}
	@AfterSuite(groups= {"common"})
	public void afterSuite() {
		endResult();
	}
	
	
	@DataProvider(name = "setData")
	public Object[][] dataProv() throws IOException {
		return ExcelData.excelData(excelFileName);
	}
	
	
	
	
	
}
