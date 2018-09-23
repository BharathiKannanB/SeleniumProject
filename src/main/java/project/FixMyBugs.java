package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FixMyBugs {

	@Test
	public void main() throws InterruptedException {

		// launch the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		// Mouse Over on Men
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByLinkText("Men")).perform();
		
		

		// Click on Jackets
		driver.findElementByXPath("//a[@href='/men-jackets']").click();
		

		// Click on Jackets and confirm the count is same
		driver.findElementByXPath("//label[text()='Jackets']").click();


		// Find the count of Jackets
		String leftCount = 
				driver.findElementByXPath("//input[@value='Jackets']/../span")
				.getText()
				.replaceAll("\\D", "");
		System.out.println(leftCount);



		// Wait for some time
		Thread.sleep(5000);

		// Check the count
		String rightCount = 
				driver.findElementByXPath("//h1[text()='Mens Jackets']/../span")
				.getText()
				.replaceAll("\\D", "");
		System.out.println(rightCount);

		// If both count matches, say success
		if(leftCount.equals(rightCount)) {
			System.out.println("The count matches on either case");
		}else {
			System.err.println("The count does not match");
		}

		// Click on Offers
		//driver.findElementByXPath("//h3[text()='Offers']").click();   // We dont have offers in Myntra right now :)

		// Find the costliest Jacket
		List<WebElement> productsPrice = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		List<Integer> onlyPrice = new ArrayList<Integer>();

		for (WebElement productPrice : productsPrice) {
			onlyPrice.add(Integer.parseInt(productPrice.getText().replaceAll("\\D", "")));
		}
		// Sort them 
		Integer max = Collections.max(onlyPrice);

		// Find the top one
		System.out.println(max);
		

		// Print Only Allen Solly Brand Minimum Price
		driver.findElementByClassName("brand-more").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@value='Allen Solly']//parent::*").click();
		driver.findElementByXPath("//ul[@class='FilterDirectory-indices']/following::span").click();
		
		Thread.sleep(5000);
		// Find the costliest Jacket
		List<WebElement> allenSollyPrices = driver.findElementsByXPath("//span[@class='product-discountedPrice']");

		List<Integer> onlyPrice1 = new ArrayList<Integer>();

		for (WebElement price : allenSollyPrices) {
			onlyPrice1.add(Integer.parseInt(price.getText().replaceAll("\\D", "")));
		}

		// Get the minimum Price 
		Integer min = Collections.min(onlyPrice1);

		// Find the lowest priced Allen Solly
		System.out.println(min);

		driver.close();
	}

}
