package week4.day1.hw.Leads;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Shri");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("sss");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Dear");
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(Source);
		dropDown.selectByVisibleText("Direct Mail");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50 Lakhs");
		WebElement Source3 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown3 = new Select(Source3);
		List<WebElement> option = dropDown3.getOptions();
		int length = option.size();
		dropDown3.selectByIndex(length-2);
		WebElement Source4 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown4 = new Select(Source4);
		dropDown4.selectByVisibleText("Public Corporation");
		driver.findElementById("createLeadForm_sicCode").sendKeys("SIC sample");
		driver.findElementById("createLeadForm_description").sendKeys("SIC Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important Note");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("5678");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		WebElement Source2 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown2 = new Select(Source2);
		dropDown2.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Sample");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("KokkiKumar");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Maari");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Vivekanandar Theru");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Dubai Kurukku Sandhu");
		driver.findElementById("createLeadForm_generalCity").sendKeys("AbuDhabi");
		WebElement Source5 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown5 = new Select(Source5);
		dropDown5.selectByVisibleText("India");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement Source6 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		@SuppressWarnings("unused")
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(Source6));   //ExplicitWait
		Select dropDown6 = new Select(Source6);
		dropDown6.selectByValue("IN-TN");		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("654321");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("12");
		WebElement Source7 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown7 = new Select(Source7);
		dropDown7.selectByIndex(7);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("987654321");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sample@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if(text.equals("Bharathi"))
		{
			System.out.println("First Name Matches");
		}
		else
		{
			System.out.println("First Name doesnt Matches");
		}

	}

}
