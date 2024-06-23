package airplainApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_B2C_MulticityFlightSearch {
	WebDriver driver;
	@FindBy(xpath="//p[.='Multi-city']")
	WebElement radio_button;
	@FindBy(xpath="//p[.='Enter city or airport']")
	WebElement To_multicity;
	@FindBy(xpath="//input[@type='text']")
	WebElement value4;
	@FindBy(xpath="(//span[.='Departure'])[2]")
	WebElement departure1;
	@FindBy(xpath="(//p[.='18'])[2]")
	WebElement date2;
	
	//step 2:
	
	public void multicity_trip()
	{
		radio_button.click();
	}
	public void search()
	{
		To_multicity.click();
		value4.sendKeys("Ayodhya");
		departure1.click();
		date2.click();
		
	}
	
	//step 3:
	public Goibibo_B2C_MulticityFlightSearch (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	


	

}
