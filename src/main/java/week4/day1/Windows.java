package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementByLinkText("Contact Us").click();;
		Set<String> WSet = driver.getWindowHandles();
	    List<String> WList = new ArrayList();
	    WList.addAll(WSet);
	    
	    //getting Title and URL of the First Window
	    driver.switchTo().window(WList.get(1));
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    // Taking Snapshot
	    driver.switchTo().window(WList.get(0));
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./snapshots/irctc.png");
	    FileUtils.copyFile(source, destination);
	    
	    //Close newly opened window
	    driver.switchTo().window(WList.get(1));
	    driver.close();
	    driver.switchTo().window(WList.get(0));   // switching back to parent window
	    
	    System.out.println(driver.getWindowHandle());  //WindowHandle unique reference number
	   
	    
	    
	    

	}

}
