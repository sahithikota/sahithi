package demo.pack.DemoProject2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class BrowserLaunch extends BasePage
{
	
  @Test(priority=0, groups= {"fullregression","sanity"})
  public void launch() throws InterruptedException 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby products");
	  Thread.sleep(5000);
  }
  
  @Test(priority=1, enabled=false)
  public void m1()
  {
	  System.out.println("m1");
  }
  
  @Test(priority=2, enabled=false)
  public void a()
  {
	  System.out.println("a");
  }
  
  @BeforeMethod(groups= {"fullregression","sanity"})
  @Parameters("browser")
  public void setUpProcess(String browser) 
  {
	  browserLaunch(browser, "https://www.amazon.in");
  }

  @AfterMethod(groups= {"fullregression","sanity"})
  public void EndProcess() 
  {
	  driver.close();
  }

}
