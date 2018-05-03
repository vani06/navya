package com.MavenProject.OnlineShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenBowser {
	public static WebDriver driver;
	
  @Test (priority=1)
  public void launchBrowser()
  {
	  System.setProperty("webdriver.gecko.driver","/Users/NarenNavya/Documents/workspace/geckodriver");
	  driver=new FirefoxDriver();
  }
  
  @Test (priority=2)
  public void launchApplication() throws InterruptedException
  {
	  driver.get("https://www.amazon.co.uk/");
	  Thread.sleep(1000);
  }
  
  @Test (priority=3)
  public void closeBrowser()
  {
	  driver.close();
  }
}
