package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Rating8 {
	WebDriver driver;
	@FindBy(xpath="(//span[.='& Up'])[1]")
	WebElement rating;
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement price;
	
	//step 2
	
	public void rating()
	{
		rating.click();
	}
	public void price()
	{
		price.click();
	}
	
	//step 3
	//step 3: initilazation element with init
		public Amazon_B2C_Rating8(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	

}
