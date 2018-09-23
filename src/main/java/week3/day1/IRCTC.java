package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("bk54321123");
		driver.findElementByLinkText("Check Availability").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Bk54321123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Bk54321123");
		WebElement source1 = driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown1 = new Select(source1);
		dropdown1.selectByValue("2");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Shakthimaan");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Bharathi");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Shri");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Kannan");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement source2 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown2 = new Select(source2);
		dropdown2.selectByValue("09");
		WebElement source3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown3 = new Select(source3);
		dropdown3.selectByValue("06");
		WebElement source4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown4 = new Select(source4);
		dropdown4.selectByValue("1992");
		WebElement source5 = driver.findElementById("userRegistrationForm:occupation");
		Select dropdown5 = new Select(source5);
		dropdown5.selectByValue("3");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("UID0123456");
		driver.findElementById("userRegistrationForm:idno").sendKeys("PAN12345");
		WebElement source6 = driver.findElementById("userRegistrationForm:countries");
		Select dropdown6 = new Select(source6);
		dropdown6.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("chumma@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("987654321");
		WebElement source7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown7 = new Select(source7);
		dropdown7.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("F Block");
		driver.findElementById("userRegistrationForm:street").sendKeys("4th Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Annanagar");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600102", Keys.TAB);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement source8 = driver.findElementById("userRegistrationForm:cityName");
		Select dropdown8 = new Select(source8);
		dropdown8.selectByVisibleText("Chennai");
		
		Thread.sleep(5000);
		WebElement source9 = driver.findElementById("userRegistrationForm:postofficeName");
		Select dropdown9 = new Select(source9);
		dropdown9.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("45678912");

		
		

	}

}
