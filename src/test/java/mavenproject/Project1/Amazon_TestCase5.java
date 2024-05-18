package mavenproject.Project1;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_TestCase5 extends TestCase0 {
  @Test
  public void searchpage() {
	  Amazon_B2C_HomeScreen a2=new Amazon_B2C_HomeScreen(driver);
	  Actions a=new Actions(driver);
	  a.moveToElement(a2.hover()).perform();
	  a2.signin();
	  Amazon_B2C_Login2 l=new Amazon_B2C_Login2(driver);
	  l.email();
	  l.continueb();
	  l.pwd();
	  l.submit();
	  Amazon_B2C_SearchProduct s=new Amazon_B2C_SearchProduct(driver);
	  s.ssfield();
	  s.button();
     // Assert.assertEquals(driver.getTitle(),"Amazon.in:shoe");
	  
  }
}
