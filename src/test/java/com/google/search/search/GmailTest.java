package com.google.search.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	
	WebDriver driver;
	
	
	@Test
	public void gmailLogin() throws InterruptedException{
		driver = new FirefoxDriver();
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