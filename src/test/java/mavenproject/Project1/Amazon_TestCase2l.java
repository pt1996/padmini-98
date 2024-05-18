package mavenproject.Project1;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_TestCase2l extends TestCase0 {
@Test

public void loginpage() {
	Amazon_B2C_Login2 l=new Amazon_B2C_Login2(driver);
	Actions a2=new Actions(driver);
	a2.moveToElement(l.hover()).perform();
	l.signin();
	l.email();
	l.continueb();
	l.pwd();
	l.submit();
}
}
