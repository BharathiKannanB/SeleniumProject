package week4.day1.hw.Leads;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@style='padding-left:155px']/input").sendKeys("10860");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Page Title verified");
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Aon");
		driver.findElementByXPath("//input[@value='Update']").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		text.replaceAll("[^a-zA-Z]+", "");
		if(text.equals("Aon"))
		{
			System.out.println("Update verified");
		}
	}

}
