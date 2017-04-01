package com.learnautomation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoforMaven {

	@Test
	public void testVerifyTitle(){
		//String userpath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", "C:\\AutomationJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Gole"),driver.getTitle());
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("csc");
		WebElement searchButton=driver.findElement(By.name("btnG"));
		searchButton.click();
		driver.quit();
		System.out.println("Hello world");
	}
}
