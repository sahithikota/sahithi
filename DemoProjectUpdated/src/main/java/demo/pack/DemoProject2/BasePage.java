package demo.pack.DemoProject2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	
	public static WebDriver driver;
	public static String path="./commondata.properties";
	public static WebDriverWait wait;
	
	public static String getData(String key) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
	public static int randomNumber() 
	{
		Random r=new Random();
		return r.nextInt(9999);
	}
	
	public static void selectOption(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	
	public static void waitElement(int timeUnits,WebElement element,String waitType)
	{
		if(waitType.equals("clickable"))
		{
			wait=new WebDriverWait(driver, timeUnits);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		else if(waitType.equals("visible"))
		{
			wait=new WebDriverWait(driver, timeUnits);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
				
	}
	
	public static void browserLaunch(String browser, String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FF"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		//driver.get(url);
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
