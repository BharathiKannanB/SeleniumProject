package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");	
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("sample");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String text = driver.findElementById("demo").getText();
		System.out.println(text);
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().dismiss();
		text = driver.findElementById("demo").getText();
		System.out.println(text);
		driver.findElementByXPath("//button[text()='Try it']").click();
		text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();

		
	}

}
