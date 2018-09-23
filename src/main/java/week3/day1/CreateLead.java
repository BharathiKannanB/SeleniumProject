package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro");
		driver.findElementById("createLeadForm_firstName").sendKeys("Bharathi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(Source);
		dropDown.selectByVisibleText("Direct Mail");
		WebElement Source2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown2 = new Select(Source2);
		dropDown2.selectByIndex(7);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Shri");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("sss");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Dear");
		driver.findElementById("createLeadForm_birthDate").sendKeys("01/01/2000");
		
		
		
		
		WebElement Source3 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown3 = new Select(Source3);
		List<WebElement> option = dropDown3.getOptions();
		int length = option.size();
		dropDown3.selectByIndex(length-2);
	/*	for(WebElement each : option)
		{
			System.out.println(each.getText());
		}*/
		WebElement Source4 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown4 = new Select(Source4);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		try {
		dropDown4.selectByValue("OWN_PUBLIC_CORPP");
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
			System.out.println("Catch 1");
		}
		
		
		
		
		
		
		//driver.findElementByClassName("smallSubmit").click();
		
		finally {
		driver.close();
		}

	}

}
