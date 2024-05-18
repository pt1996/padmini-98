package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_EachPayment {
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement select_payment2;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement select_payment3;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement select_payment4;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement select_payment5;
	
	//step 2:
	
	public WebElement spayment2() 
	{
	
		select_payment2.click();
		return select_payment2;
		
		
	}
	public WebElement spayment3() 
	{
	
		select_payment3.click();
		return select_payment3;
		
		
	}
	public WebElement spayment4() 
	{
	
		select_payment4.click();
		return select_payment4;
		
		
	}
	public WebElement spayment5() 
	{
	
		select_payment5.click();
		return select_payment5;
		
		
	}
	//step 3:
		public Amazon_B2C_EachPayment(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		

}
