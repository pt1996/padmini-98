package mavenproject.Project1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class Amazon_TestCase13 extends TestCase0 {
		@Test
		public void addcart() {
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
	 Amazon_B2c_UpdatingQ u=new Amazon_B2c_UpdatingQ(driver);
	 u.gocart();
	 u.quant();
	 Amazon_B2c_CheckOut c1=new Amazon_B2c_CheckOut(driver);
		c1.pbuy();
		c1.saddress();
		c1.useaddress();
		Amazon_B2C_CouponCode  d=new Amazon_B2C_CouponCode (driver);
		d.keyvalue();
		d.button();
		

}
	}
