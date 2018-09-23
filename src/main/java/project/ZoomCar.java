package project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class ZoomCar extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "Zoom Car";
		testCaseDesc = "Zoom Car flow";
		category = "smoke";
		author = "shri";
	}
	@Test
	public void zoom() throws InterruptedException
	{
		startApp("chrome", "https://www.zoomcar.com/chennai");
		
		
		WebElement cld = locateElement("xpath","//a[@class='search']");
		click(cld);
		WebElement loc = locateElement("xpath","//div[@class='component-popular-locations']/div[2]");
		click(loc);
		WebElement next = locateElement("xpath","//button[@class='proceed']");
		click(next);
		// Get the current date
				Date date = new Date();
		// Get only the date (and not month, year, time etc)
				DateFormat sdf = new SimpleDateFormat("dd"); 
		// Get today's date
				String today = sdf.format(date);
		// Convert to integer and add 1 to it
				int tomorrow = Integer.parseInt(today)+1;
		// Print tomorrow's date
				System.out.println(tomorrow);
				WebElement cdate = locateElement("xpath","//div[@class='days']/div[2]");
				click(cdate);	
				WebElement next1 = locateElement("xpath","//button[@class='proceed']");
				click(next1);
				WebElement cdate1 = locateElement("xpath","//div[@class='days']/div[2]");
				click(cdate1);	
				WebElement next2 = locateElement("xpath","//button[@class='proceed']");
				click(next2);
				Thread.sleep(5000);
				List<WebElement> carPrice = driver.findElementsByXPath("//div[@class='price']");
				List<Integer> onlyPrice = new ArrayList<Integer>();

				for (WebElement cPrice : carPrice) {
					onlyPrice.add(Integer.parseInt(cPrice.getText().replaceAll("\\D", "")));
				}
				// Sort them 
				Integer max = Collections.max(onlyPrice);
				System.out.println(max);
			
				WebElement maxEle = locateElement("xpath","//div[contains(text(),'"+max+"')]/following-sibling::button");
				
				String brand = locateElement("xpath","//div[contains(text(), "+max+")]/../parent::*/preceding-sibling::div[1]/h3").getText();
				System.out.println(brand);
				click(maxEle);
				
				
	}
	
}