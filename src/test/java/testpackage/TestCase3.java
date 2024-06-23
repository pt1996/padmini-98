package testpackage;

import airplainApplication.Goibibo_LoginDetails;
import launchquit.GoibiboLaunchQuit;

public class TestCase3 extends  GoibiboLaunchQuit {
	public void Logindetails()
	{
		Goibibo_LoginDetails l=new Goibibo_LoginDetails(driver);
		l.login();
		l.button();
		
	}

}
