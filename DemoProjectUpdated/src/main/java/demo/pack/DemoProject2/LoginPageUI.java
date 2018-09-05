package demo.pack.DemoProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUI extends BasePage
{
	//Login Page Properties
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement email;
	@FindBy(id="passwd")public WebElement passwd;
	@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")public WebElement errorMsg;
	
	
	//Registration Page Properties
	
	@FindBy(id="email_create")public WebElement regName;
	@FindBy(id="SubmitCreate")public WebElement SubmitCreate;
	@FindBy(id="id_gender1")public WebElement male;
	@FindBy(id="customer_firstname")public WebElement firstName;
	@FindBy(id="customer_lastname")public WebElement lastName;
	@FindBy(id="days")public WebElement day;
	@FindBy(id="months")public WebElement month;
	@FindBy(id="years")public WebElement year;
	@FindBy(id="address1")public WebElement address;
	@FindBy(id="city")public WebElement city;
	@FindBy(id="id_state")public WebElement state;
	@FindBy(id="postcode")public WebElement postalCode;
	@FindBy(id="id_country")public WebElement country;
	@FindBy(id="phone_mobile")public WebElement phone;
	@FindBy(id="alias")public WebElement aliasAddress;
	@FindBy(id="submitAccount")public WebElement submitAccount;
	
	
	
	
	
	
	
	public LoginPageUI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void customerLogin()
	{
		signIn.click();
		email.sendKeys("qatest878@gmail.com");
		passwd.sendKeys("password");
		submitLogin.click();
	}
	
	
	public String errorVerification()
	{
		return errorMsg.getText();
	}

	
	public void customerRegistration() throws Exception
	{
		signIn.click();
		regName.sendKeys(getData("fname")+ getData("lname")+randomNumber()+getData("domain"));
		System.out.println(regName.getAttribute("value"));
		SubmitCreate.click();
		
		waitElement(20, male,"clickable");
		male.click();
		firstName.sendKeys(getData("fname"));
		lastName.sendKeys(getData("lname"));
		passwd.sendKeys(getData("pass"));
			
		selectOption(day, 3);
		selectOption(month, 4);
		selectOption(year, 5);
			
		address.sendKeys("kukatpally");
		city.sendKeys("hyderabad");
		state.sendKeys("Alabamas");
		postalCode.sendKeys("50000");
		country.sendKeys("United States");
		phone.sendKeys("9876765454");
		aliasAddress.sendKeys("qatest123@gmail.com");
		submitAccount.click();
	}


	
	
}
