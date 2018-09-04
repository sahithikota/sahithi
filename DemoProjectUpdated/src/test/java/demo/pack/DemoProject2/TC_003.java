package demo.pack.DemoProject2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC_003 extends BasePage
{
  LoginPageUI page;
	
  @BeforeClass
  public void startProcess() 
  {
	  browserLaunch("chrome", "http://automationpractice.com/index.php");
  }
  
  
  @Test(enabled=false)
  public void login() 
  {
	  page=new LoginPageUI(driver);
	  page.customerLogin();
	  Assert.assertEquals("Authentication failed.", page.errorVerification());
  }
  
  @Test
  public void registration() throws Exception
  {
	  page=new LoginPageUI(driver);
	  page.customerRegistration();
  }
  

  @AfterClass
  public void endProcess() 
  {
	  
  }

}
