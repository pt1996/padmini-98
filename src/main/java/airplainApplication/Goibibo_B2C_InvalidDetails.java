package airplainApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_B2C_InvalidDetails {
	@FindBy(xpath="//input[@class='loginCont__input']")
	WebElement mobilenumber;
	@FindBy(xpath="//button[.='Continue']")
	WebElement click;
	
	//step 2
	public void login()
	{
		mobilenumber.sendKeys("9493056857");
		
	}
	public void button()
	{
		click.click();
	}
	
	//step 3
	
	public Goibibo_B2C_InvalidDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
