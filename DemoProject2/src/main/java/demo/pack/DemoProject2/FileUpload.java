package demo.pack.DemoProject2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUpload {
 
WebDriver driver;	

  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("C:\\Users\\Ravi Kanth\\Desktop\\fileupload.html");
  }
  
  
  @Test
  public void fileupload() throws IOException, InterruptedException 
  {
	  driver.findElement(By.xpath(".//*[@id='1']")).click();
	  Thread.sleep(3000);
	  
	  
	  //Runtime.getRuntime().exec("D:\\uploadupdated.exe");
	  Runtime.getRuntime().exec("D:\\Browser Drivers\\uploadupdated.exe");
  }

  @AfterMethod
  public void afterMethod()
  {
	  //driver.quit();
  }

}
