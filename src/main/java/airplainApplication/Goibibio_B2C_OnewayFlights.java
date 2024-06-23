package airplainApplication;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibio_B2C_OnewayFlights {
	WebDriver driver;
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement close_window;
	@FindBy(xpath="(//div[@class='sc-12foipm-2 eTBlJr fswFld '])[1]")
	WebElement from_city;
	@FindBy(xpath="//input[@type='text']")
	WebElement text;
	@FindBy(xpath="//input[@type='text']")
	WebElement to_city;
	@FindBy(xpath="//span[.='Departure']")
	WebElement departure;
	@FindBy(xpath="(//p[.='16'])[2]")
	WebElement date;
	@FindBy(xpath="//span[.='SEARCH FLIGHTS']")
	WebElement search_flights;
	
	//step 2: create methods
	
	public void F_city() throws InterruptedException
	{
		close_window.click();
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
		date.click();
	}
	public void serach_flights()
	{
		search_flights.click();
	}
	//step 3: Page factory method
	public Goibibio_B2C_OnewayFlights(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}