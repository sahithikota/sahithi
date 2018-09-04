package demo.pack.DemoProject2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_001 extends BasePage
{
  @Test(groups= {"fullregression","smoke"})
  public void bangar() 
  {
	  System.out.println(driver.getTitle());
  }
  
  @BeforeMethod(groups= {"fullregression","smoke"})
  @Parameters("browser")
  public void startProcess(String browser) 
  {
	  browserLaunch(browser, "https://www.flipkart.com");
  }

  @AfterMethod(groups= {"fullregression","smoke"})
  public void endProcess() 
  {
	  driver.quit();
  }

}
