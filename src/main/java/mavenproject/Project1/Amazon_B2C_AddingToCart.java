package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_AddingToCart {
	WebDriver driver;
	
	//step 1:
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_cart;
	
//step 2:
	public void addcart() {
		add_cart.click();
		
	}
	
	//step 3:
	public Amazon_B2C_AddingToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
