package airplainApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Goibibo_B2C_ValidateSearchResult {
	WebDriver driver;
	//step 1:
	
	@FindBy(xpath="(//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle'])[4]")
	WebElement traveller_class;
	@FindBy(xpath="//a[.='Done']")
	WebElement done;
	@FindBy(xpath="//li[.='business']")
	WebElement business_class;
	@FindBy(xpath="//a[.='Done']")
	WebElement done1;
	@FindBy(xpath="//li[.='first class']")
	WebElement first_class;
	@FindBy(xpath="//a[.='Done']")
	WebElement done2;
	
	//step2 : create methods
	public void traveller_class()
	{
		traveller_class.click();
		done.click();
		
	}
	public void business_class() {
		traveller_class.click();
		business_class.click();
		done1.click();
	}
	public void first_class()
	{
		traveller_class.click();
		first_class.click();
		done2.click();
	}
	
	//step 3:
	public  Goibibo_B2C_ValidateSearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
