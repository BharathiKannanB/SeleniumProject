package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		Actions builder = new Actions(driver);
		WebElement drag = driver.findElementById("draggable");
		int x = drag.getLocation().getX();
		int y = drag.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		builder.dragAndDropBy(drag, x+100, y+100).perform();
		
		
		

	}

}
