package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_CouponCode {
	WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement enter_value;
	@FindBy(xpath="//span[@id='pp-yk5AT9-95-announce']")
	WebElement button;
	
	// step 2
	public void keyvalue()
	{
		enter_value.sendKeys("ADGHB");
	}
	public void button()
	{
		button.click();
		
	}
	
	// step 3
	public Amazon_B2C_CouponCode(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
