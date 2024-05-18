package mavenproject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_B2c_UpdatingQ {
	WebDriver driver;
	
	//step 1:
	
	@FindBy(xpath="//a[.='Go to Cart']")
	WebElement go_cart;
	@FindBy(xpath="(//span[@class='a-dropdown-label'])[1]")
	WebElement qun;
	//step 2:
		
		public void gocart() {
			go_cart.click();
		}
		public WebElement quant() {
			Select s1=new Select(qun);
			 s1.selectByIndex(4);
			return qun;
		}
		//step 3:
		public Amazon_B2c_UpdatingQ(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
