package mavenproject.Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Amazon_TestCase1  extends TestCase0{
	
	@Test
	public void testcase1()
	{
		
		Amazon_B2C_NewUserRegistration a=new Amazon_B2C_NewUserRegistration(driver);
		Actions a1=new Actions(driver);
		a1.moveToElement(a.hover()).perform();
		
		a.newaccount();
		a.customername();
		a.mobile();
		a.password();
		a.auth();
		
		
		
		
	}

	
}
