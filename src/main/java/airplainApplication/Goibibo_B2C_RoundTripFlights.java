package airplainApplication;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_B2C_RoundTripFlights {
	WebDriver driver;
	//Step 1 :  Use @FindBy annotation
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement close_window;
	@FindBy(xpath="(//span[@class='sc-12foipm-70 bWWMhV'])[1]")
	WebElement select_radio;
	@FindBy(xpath="(//div[@class='sc-12foipm-2 eTBlJr fswFld '])[1]")
	WebElement from_city;
	@FindBy(xpath="//input[@type='text']")
	WebElement text;
	@FindBy(xpath="//input[@type='text']")
	WebElement to_city;
	@FindBy(xpath="//span[.='Departure']")
	WebElement departure;
	@FindBy(xpath="(//p[.='16'])[2]")
	WebElement to_date;
	@FindBy(xpath="//span[.='Return']")
	WebElement return_journey;
	@FindBy(xpath="(//p[.='18'])[2]")
	WebElement select_return_date;
	@FindBy(xpath="//span[.='SEARCH FLIGHTS']")
	WebElement search_flights;
	
	// step 2: create methods
	
	public void close_window() 
	{
		close_window.click();
	}
	public void roundtrip()
	{
		select_radio.click();
	}
	public void F_city() throws InterruptedException
	{
		from_city.click();
		text.sendKeys("Bangalore");
		Thread.sleep(3000);
		text.sendKeys(Keys.ENTER);
	}
	public void T_city() throws InterruptedException
	{
		to_city.sendKeys("New delhi");
		Thread.sleep(3000);
		to_city.sendKeys(Keys.ENTER);
		
	}
	public void date()
	{
		departure.click();
		to_date.click();
	}
	public void return_journey()
	{
		select_return_date.click();
	}
	public void serach_flights()
	{
		search_flights.click();
	}
	
	//step 3: PageFactory method
	public Goibibo_B2C_RoundTripFlights(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
	


