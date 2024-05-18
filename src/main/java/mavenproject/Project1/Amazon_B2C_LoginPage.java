package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Amazon_B2C_LoginPage {
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
    WebElement hover;    //hover 
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_button;
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement submit_button;
	public WebElement hover() {
		return hover;
	}
	
	public void email() {
		email.sendKeys("9441057839");
	}
	public void continueb() {
		continue_button.click();
	}
	public void pwd( ) {
		password.sendKeys("Yamini@98");
	}
	public void submit() {
		submit_button.click();
	}
	public Amazon_B2C_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
