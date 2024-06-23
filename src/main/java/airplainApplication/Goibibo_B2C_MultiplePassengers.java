package airplainApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_B2C_MultiplePassengers {
	WebDriver driver;
	@FindBy(xpath="(//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle'])[4]")
	WebElement traveller;
	@FindBy(xpath="(//span[@class='sc-12foipm-51 kZvHQU'])[2]")
	WebElement adult;
	
	//step 2:
	public void traveller_class1()
	{
		traveller.click();
		adult.click();
		adult.click();
		
	}
	public Goibibo_B2C_MultiplePassengers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
