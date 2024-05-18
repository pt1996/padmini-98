package mavenproject.Project1;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Amazon_TestCase15  extends TestCase0{
	@Test
	public void withoutlogin()
	{
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

}
}
