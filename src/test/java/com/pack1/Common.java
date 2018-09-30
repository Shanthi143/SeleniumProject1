package com.pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Common {
	 WebDriver driver;

	public  void launchBrowser(String browserName) {
		if (browserName == "Chrome") {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\BrowserDrivers\\chromedriver.exe");
            driver=new ChromeDriver();
		}

		if (browserName == "Firefox") {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\BrowserDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();

		}

		if (browserName == "InternetExplorer") {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\BrowserDrivers\\IEDriverserver.exe");
			driver=new InternetExplorerDriver();
		}

	}
	
	public  void accesApplication(String url) {
		driver.get(url);
	}
	
	public void quitBrowser()	{
		driver.quit();		
	}
	
	public void closeBrowser()	{
		driver.close();		
	}

	public void setIntoTextBox(String locatorValue, String value) {
		driver.findElement(By.xpath(locatorValue)).sendKeys(value);
	}

	public void clickOnButton(String locatorValue) {
		driver.findElement(By.xpath(locatorValue)).click();
	}
	
	
	public void clickOnLink(String locatorValue) {
		driver.findElement(By.linkText(locatorValue)).click();
	}
	
	public void waitFor(int timeInMS) throws Throwable {
		Thread.sleep(timeInMS);
	}
	
	
	

}
