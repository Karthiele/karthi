package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class demo {
  @Test
  public void f() 
  {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

  RemoteWebDriver driver = new ChromeDriver();
  
  driver.get("https://www.google.com");
		  
  driver.close();
  }
}
