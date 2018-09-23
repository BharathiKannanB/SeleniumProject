package week4.day1.hw.Leads;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByName("phoneNumber").sendKeys("987654321");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String id = driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").getText();
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys(id);
		driver.findElementByXPath("//button[text()='Find Leads']").click();	
		Thread.sleep(5000);
		String text = driver.findElementByClassName("x-paging-info").getText();
		if(text.equals("No records to display"))
		{
			System.out.println("Error Message Verified");
		}
		
	}

}
