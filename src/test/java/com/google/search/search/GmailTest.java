package com.google.search.search;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class GmailTest {
	
	WebDriver driver;
	String nodeURL;
	
	@Test
	public void gmailLogin() throws InterruptedException, MalformedURLException{
		
		
		DesiredCapabilities desCaps = DesiredCapabilities.firefox();
		desCaps.setPlatform(Platform.LINUX);
		nodeURL = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(nodeURL), desCaps);
		
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Verizon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle().contains("Verizon"), true);
		driver.close();
		driver.quit();
	}
	
	
}