package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibo_LoginDetails;
import launchquit.GoibiboLaunchQuit;

public class TestCase2 extends GoibiboLaunchQuit {
	@Test
	public void Logindetails()
	{
		Goibibo_LoginDetails l=new Goibibo_LoginDetails(driver);
		l.login();
		l.button();
		
	}

}
