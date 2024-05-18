package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_EditProfile {
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
	@FindBy(id="nav-link-accountList")
	WebElement hover1;
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement manage_profile;
	@FindBy(xpath="//a[.='View']")
	WebElement view_link;
	@FindBy(xpath="(//span[@class='a-declarative'])[9]")
	WebElement edit;
	@FindBy(id="editProfileNameInputId")
	WebElement value;
	
	//step 2;
	public WebElement hover() {
		return hover;
	}
	public void signin() {
		signin_button.click();
	}
	public void email() {
		email.sendKeys("9441057839");
	}
	public void continueb() {
		continue_button.click();
	}
	public void pwd() {
		password.sendKeys("Yamini@98");
	}
	public void submit() {
		submit_button.click();
	}
	
	public WebElement hover1() {
		return hover1;
		
	}
	public void manage() {
		manage_profile.click();
		
	}
	public void view() {
		view_link.click();
		
	}
	public void edit() {
		edit.click();
	}
	public void value() {
		value.sendKeys("paddu");
	}
	
	//step 3:
	public Amazon_B2C_EditProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
