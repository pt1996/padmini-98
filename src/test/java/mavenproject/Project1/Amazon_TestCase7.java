package mavenproject.Project1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Amazon_TestCase7 extends TestCase0 {
	@Test
	public void productpage() {
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
		      p.product();
		      p.product_price();
		      p.product_desc();
		      p.review();
		 
		
	}

}
