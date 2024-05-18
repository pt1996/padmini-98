package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_WithoutLogin {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	  WebElement search_field;
	  @FindBy(id="nav-search-submit-button")
	  WebElement search_button;
	  @FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
		WebElement product;
	  @FindBy(xpath="//input[@id='add-to-cart-button']")
		WebElement add_cart;
		
	  //step 2:
	  public void ssfield() {
		  search_field.sendKeys("shoe");
	  }
	  public void button() {
		  search_button.click();
	  }
	  public void product() {
			product.click();
	  }
			
			public void addcart() {
				add_cart.click();
				
			}
			
			//step 3:
			public Amazon_B2C_WithoutLogin  (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
	
	

}
