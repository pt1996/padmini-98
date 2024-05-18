package mavenproject.Project1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_SearchProduct  {
  WebDriver driver;
  
  @FindBy(id="twotabsearchtextbox")
  WebElement search_field;
  @FindBy(id="nav-search-submit-button")
  WebElement search_button;
  
  //step 2:
  
	
  public void ssfield() {
	  search_field.sendKeys("shoe");
  }
  public void button() {
	  search_button.click();
  }
  
  //step 3:
  public Amazon_B2C_SearchProduct(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
}
