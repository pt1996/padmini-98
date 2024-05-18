package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_HomeScreen {
	//step 1: locating each component using@FindBy annotation .
	WebDriver driver;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
    WebElement hover;    //hover 
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_button;
	
	
	//step 2: creating seperate component for each method
	
	public WebElement hover() {
		return hover;
	}
	public void signin() {
		signin_button.click();
	}
	
	
	//step 3: initilazation usingpageFactory constructor
	
	public Amazon_B2C_HomeScreen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
