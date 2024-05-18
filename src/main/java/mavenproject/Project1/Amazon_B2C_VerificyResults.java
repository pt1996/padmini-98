package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_VerificyResults {
	WebDriver driver;
	@FindBy(linkText="Women's Running Shoes")
	WebElement catgeory;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[4]")
     WebElement brand1;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
	WebElement brand2;
	@FindBy(xpath="//li[@id='p_36/4516641031']")
	WebElement price;
	@FindBy(xpath="//input[@id='low-price']")
	WebElement min_range;
	@FindBy(xpath="//input[@id='high-price']")
	WebElement high_price;
	@FindBy(xpath="//span[@class='a-button a-spacing-top-mini a-button-base s-small-margin-left']")
	WebElement go_button;
	
	//step 2:
	public void catgeory() {
		catgeory.click();
		
	}
	public void brand1() {
		brand1.click();
	}
	public void brand2() {
		brand2.click();
		
	}
	public void price() {
		price.click();
	}
	public void min_range() {
		min_range.sendKeys("2000");
		
	}
	public void max_range() {
		high_price.sendKeys("3000");
	}
	public void button() {
		go_button.click();
	}
	
	//step 3:
	public Amazon_B2C_VerificyResults (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
