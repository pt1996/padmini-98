package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2c_CheckOut {
	WebDriver driver;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement select_address;
	@FindBy(xpath="(//span[@class='a-button-inner'])[3]")
	WebElement use_address;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement select_payment;
	
	//step 2:
	public void pbuy() {
		proceed_to_buy.click();
	}
	public void saddress()
	{
		select_address.click();
	}
	public void useaddress() {
		use_address.click();
	}
	public WebElement spayment() 
	{
	
		select_payment.click();
		return select_payment;
		
		
	}
	
	//step 3:
	public Amazon_B2c_CheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
