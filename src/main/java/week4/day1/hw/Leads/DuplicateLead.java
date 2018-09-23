package week4.day1.hw.Leads;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("sample@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//tr//div)[3]/a").getText();
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//tr//div)[3]/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("Title Verified");
		}
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		String duplicatetext = driver.findElementById("viewLead_firstName_sp").getText();
		if(duplicatetext.equals(text))	
		{
			System.out.println("Duplicated Name Verified");
		}
		driver.close();
	}

}
