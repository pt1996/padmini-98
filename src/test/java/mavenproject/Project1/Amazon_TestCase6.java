package mavenproject.Project1;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Amazon_TestCase6 extends TestCase0{
	@Test
	public  void verifyresult()
	{
		Amazon_B2C_HomeScreen a2=new Amazon_B2C_HomeScreen(driver);
		  Actions a=new Actions(driver);
		  a.moveToElement(a2.hover()).perform();
		  a2.signin();
		  Amazon_B2C_LoginPage l=new Amazon_B2C_LoginPage(driver);
		  l.email();
		  l.continueb();
		  l.pwd();
		  l.submit();
		  Amazon_B2C_SearchProduct s=new Amazon_B2C_SearchProduct(driver);
		  s.ssfield();
		  s.button();
		  Amazon_B2C_VerificyResults v=new Amazon_B2C_VerificyResults(driver);
		  v.catgeory();
		  v.brand1();
		  v.brand2();
		  v.price();
		  v.min_range();
		  v.max_range();
		  v.button();
		  Assert.assertEquals(driver.getTitle(), "India - Google Search");
		  Assert.assertNotEquals(driver.getTitle(), "India - Google Search");
           Assert.assertTrue(false);    
	}          
}
