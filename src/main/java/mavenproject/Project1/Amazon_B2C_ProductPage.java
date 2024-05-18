package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_ProductPage {
	WebDriver driver;
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement product;
	//product price
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement product_price;
	//product_DES
	@FindBy(xpath="(//div[@class='aplus-v2 desktop celwidget']")
	WebElement product_des;
	// click review 
	@FindBy(xpath="(//a[@id='acrCustomerReviewLink'])[1]")
	WebElement review_click;
	
	
	
	
	
	//step 2:
	public void product() {
		product.click();
		if(product.isSelected())
		{
			System.out.println("Product selected");
		}
		else
		{
			System.out.println("product is not selected");
		}
	}
	public void product_price() {
		
		if(product.isDisplayed())
		{
			System.out.println("Product Description is displaying");
		}
		else
		{
			System.out.println("Product description is not showing");
		}
	}
	public void product_desc() {
		if(product_des.isDisplayed()) {
			System.out.println("Price is displaying");
		}
		else
		{
			System.out.println("price is not displaying");
		}
	}
	
	
	public void review() {
		
		if(review_click.isDisplayed())
		{
			System.out.println("customer reviewrs are displaying");
		}
		else
		{
			System.out.println("customer reviews are not displaying");
		}
	}
	
	//step 3:
	public Amazon_B2C_ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	}	

	
		
	


