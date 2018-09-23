package week4.day1.hw.Leads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

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
	driver.findElementByLinkText("Merge Leads").click();
	driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();
	Set<String> wSet = driver.getWindowHandles();
	List<String> wList = new ArrayList<>();
	wList.addAll(wSet);
	driver.switchTo().window(wList.get(1));
	driver.findElementByXPath("(//div[@class='x-form-element'])[2]/input").sendKeys("Bharathi");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").click();
	driver.switchTo().window(wList.get(0));
	driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a").click();
	wSet = driver.getWindowHandles();
	wList = new ArrayList<>();
	wList.addAll(wSet);
	driver.switchTo().window(wList.get(1));
	driver.findElementByXPath("//div[@class='x-form-element']/input").sendKeys("11388");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").click();		
	driver.switchTo().window(wList.get(0));
	driver.findElementByClassName("buttonDangerous").click();
	driver.switchTo().alert().accept();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//div[@style='padding-left:155px']/input").sendKeys("11099");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	String text = driver.findElementByClassName("x-paging-info").getText();
	if(text.equals("No records to display"))
	{
		System.out.println("Error Message Verified");
	}
	//driver.close();
	}

}
