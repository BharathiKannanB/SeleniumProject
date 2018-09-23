package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		// C/W 1
		
		List<WebElement> cbList = driver.findElementsByXPath("//input[@type='checkbox']");
		int length = cbList.size();
		System.out.println(length);
		WebElement lastCB = cbList.get(length-1);
		lastCB.click();
		
		// C/W 2
		
		List<WebElement> tableRow = driver.findElementsByTagName("tr");
		int len = tableRow.size();
		for(int i=1; i<len; i++)
		{
		WebElement fRow = tableRow.get(i);
		List<WebElement> fCol = fRow.findElements(By.tagName("td"));
		
		/*for (WebElement etd : fCol) {
			System.out.println(etd.getText());
			if(etd.equals("80%"))
			{
				fCol.get(2).click();	
			}
		}*/
		WebElement tData = fCol.get(1);
		
		String Text1 = tData.getText();
		System.out.println(Text1);
		if(Text1.equals("80%"))
		{
		fCol.get(2).click();
		}
	}
		
		
	}

}
