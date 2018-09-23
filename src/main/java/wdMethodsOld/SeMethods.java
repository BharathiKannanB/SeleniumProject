package wdMethodsOld;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeMethods implements WdMethods{
	public RemoteWebDriver driver;
	public int i = 1;
	public void startApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver  = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver  = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" launched successfully");
		takeSnap();

	}


	public WebElement locateElement(String locator, String locValue) {
		try {
		switch (locator) {
		case "id": return driver.findElementById(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);
		case "linktext": return driver.findElementByLinkText(locValue);	
		case "name" : return driver.findElementByName(locValue);
		case "tagname" : return driver.findElementByTagName(locValue);
		case "partiallinktext" : return driver.findElementByPartialLinkText(locValue);
		case "cssselector" : return driver.findElementByCssSelector(locValue);
		}
		}
		catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
			catch (WebDriverException e) {
				System.err.println("WebDriver Exception Occured");
				}
			catch (Exception e) {
				System.err.println("Exception Occured");
				}
		return null;
	}

	
	public WebElement locateElement(String locValue) {		
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is entered Successfully");
		takeSnap();
	}

	public void clear(WebElement ele) {
		ele.clear();
		System.out.println("The Element "+ele+" is cleared Successfully");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();
	}

	
	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("The Dropdown Element "+ele+" is selected Successfully");
		takeSnap();
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("The Dropdown Element "+ele+" is selected Successfully");
		takeSnap();
	}
	
	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select dropdown = new Select(ele);
		dropdown.selectByValue(value);
		System.out.println("The Dropdown Element "+ele+" is selected Successfully");
		takeSnap();
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		String text = driver.getTitle();
		if(text.equals(expectedTitle)) {
		System.out.println("The expected title "+text+" is verified Successfully");
		return true;
		}
		else return false;

		
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
	try {
		String text = ele.getText();
		if(text.equals(expectedText))
		{
			System.out.println("The expected text "+text+" is verified Successfully");
		}
	} catch (NoSuchElementException e) {
		System.err.println("Element not found Exception Occured");
		}
	catch (StaleElementReferenceException e) {
		System.err.println("Stale Exception Occured");
		}
	catch (WebDriverException e) {
		System.err.println("WebDriver Exception Occured");
		}
	catch (Exception e) {
		System.err.println("Exception Occured");
		}
	

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String text = ele.getText();
			if(text.contains(expectedText))
			{
				System.out.println("The partial text "+text+" is verified Successfully");
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
		catch (WebDriverException e) {
			System.err.println("WebDriver Exception Occured");
			}
		catch (Exception e) {
			System.err.println("Exception Occured");
			}

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String text = ele.getAttribute(attribute);
			if(text.equals(value))
			{
				System.out.println("The expected exact attribute value "+text+" is verified Successfully");
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
		catch (WebDriverException e) {
			System.err.println("WebDriver Exception Occured");
			}
		catch (Exception e) {
			System.err.println("Exception Occured");
			}

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String text = ele.getAttribute(attribute);
			if(text.contains(value))
			{
				System.out.println("The expected partial attribute value "+text+" is verified Successfully");
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
		catch (WebDriverException e) {
			System.err.println("WebDriver Exception Occured");
			}
		catch (Exception e) {
			System.err.println("Exception Occured");
			}


	}

	@Override
	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				System.out.println("Element is Selected");
			}
		} 
		catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
			catch (WebDriverException e) {
				System.err.println("WebDriver Exception Occured");
				}
			catch (Exception e) {
				System.err.println("Exception Occured");
				}


	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				System.out.println("Element is Displayed");
			}
		} 
		catch (NoSuchElementException e) {
			System.err.println("Element not found Exception Occured");
			}
		catch (StaleElementReferenceException e) {
			System.err.println("Stale Exception Occured");
			}
			catch (WebDriverException e) {
				System.err.println("WebDriver Exception Occured");
				}
			catch (Exception e) {
				System.err.println("Exception Occured");
				}


	}

	@Override
	public void switchToWindow(int index) {
		
		try {
			Set<String> sWin = driver.getWindowHandles();
			List<String> lWin = new ArrayList<>();
			lWin.addAll(sWin);
			driver.switchTo().window(lWin.get(index));
			System.out.println("Window Switched");
		} catch (NoSuchWindowException e) {
		System.err.println(" No such Window Found");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(" Array Index of WindowHandles out of bound");
			}
		catch (WebDriverException e) {
			System.err.println("WebDriver Exception Occured");
			}
		catch (Exception e) {
			System.err.println("Exception Occured");
			}
		finally
		{
			takeSnap();
		}

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}


	public void takeSnap() {
		try {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");		
		FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void explicitWait(int time, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(ele)); 
		
	}

	@Override
	public void closeBrowser() {
		driver.close();

	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();

	}


}
