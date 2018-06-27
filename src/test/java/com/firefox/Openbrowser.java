package com.firefox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Openbrowser {
	WebDriver driver;
	String expectedResult="selenium - Google Search";
  @Test
  public void googlesearch() {
	driver.get("https://www.google.com");  
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("btnK")).click();
	Assert.assertEquals(expectedResult, driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:/TestDevops-Softwares/geckodriver.exe");
	  driver=new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}