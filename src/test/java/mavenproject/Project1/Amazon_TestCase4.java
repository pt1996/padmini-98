package mavenproject.Project1;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_TestCase4 extends TestCase0 {
	@Test
	public void edit_profile() {
         
		Amazon_B2C_EditProfile e=new Amazon_B2C_EditProfile(driver);
		Actions a1=new Actions(driver);
		a1.moveToElement(e.hover()).perform();
		
		e.hover();
		e.signin();
		e.email();
		e.continueb();
		e.pwd();
		e.submit();
		Actions a2=new Actions(driver);
		a2.moveToElement(e.hover1()).perform();
		e.hover1();
		e.manage();
		e.view();
		e.edit();
		e.value();
	}

}
