package mavenproject.Project1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_TestCase12 extends TestCase0 {
	@Test
	public void addcart()  {
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
		  Amazon_B2C_ProductPage  p=new Amazon_B2C_ProductPage (driver);
		  p.product();
		  String parent= driver.getWindowHandle();
		  Set<String> child   =   driver.getWindowHandles();
		  Iterator<String> pid=child.iterator();
		       String pid1=  pid.next();
		       String cid=pid.next();
		       driver.switchTo().window(cid);
	Amazon_B2C_AddingToCart  c=new Amazon_B2C_AddingToCart (driver);
	c.addcart();
	Amazon_B2c_CheckOut c1=new Amazon_B2c_CheckOut(driver);
	c1.pbuy();
	c1.saddress();
	c1.useaddress();
	Amazon_B2C_EachPayment e=new Amazon_B2C_EachPayment(driver);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(e.spayment2()));
	wait.until(ExpectedConditions.visibilityOf(e.spayment3()));
	wait.until(ExpectedConditions.visibilityOf(e.spayment4()));
	wait.until(ExpectedConditions.visibilityOf(e.spayment5()));
	
	e.spayment2();
	e.spayment3();
	e.spayment4();
	e.spayment5();
	Assert.assertEquals(driver.getTitle(),"Amazon.in Checkout");
	
	

}
}
