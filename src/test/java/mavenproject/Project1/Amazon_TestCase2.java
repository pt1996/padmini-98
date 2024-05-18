package mavenproject.Project1;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Amazon_TestCase2 extends TestCase0{
	@Test
	
	public void loginpage(String username, String userpwd) {
		Amazon_B2C_LoginPage l=new Amazon_B2C_LoginPage(driver);
		Actions a2=new Actions(driver);
		a2.moveToElement(l.hover()).perform();
		l.email();
		l.continueb();
		l.pwd();
		l.submit();
		
		
		
		
	}

}
