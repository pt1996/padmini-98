package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_NewUserRegistration {
    //step 1: locating each component using@FindBy annotation .
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
      WebElement hover;    //hover 
	@FindBy(xpath="//a[.='Start here.']")
	WebElement new_account;      // new user account
	@FindBy(id="ap_customer_name")
	WebElement customer_name;   // customer name
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;   // mobile number
	@FindBy(id="ap_password")
	WebElement password_field;    //password filed
	@FindBy(id="auth-continue")
	WebElement verification_filed;   //Verification field
	
	//step 2: creating seperate component for each components
	public WebElement hover() {
		return hover;
	}
	
	public void newaccount()
	{
		new_account.click();
	}
	public void customername() {
		customer_name.sendKeys("Padmini");
	}
	public void mobile() {
		mobilenumber.sendKeys("8712345689");
	}
	public void password() {
		password_field.sendKeys("Yamu@123");
		
	}
	public void auth()
	{
		verification_filed.click();
	}
	
	//step 3: initilazation element with init
	public Amazon_B2C_NewUserRegistration(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
