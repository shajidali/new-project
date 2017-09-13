package STTA.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverTest {
	
	 WebDriver driver;

	  @BeforeMethod
	  public void StartBrowser_NavURL() {
		  System.setProperty("webdriver.gecko.driver","D://Software//geckodriver-v0.18.0-win64//geckodriver.exe");
	   driver = new FirefoxDriver();
	   //driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void CloseBrowser() {
	   driver.quit();
	  }

	  @Test
	  public void testToCompareDoubles() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.get("http://only-testing-blog.blogspot.in/");
	  }
}
