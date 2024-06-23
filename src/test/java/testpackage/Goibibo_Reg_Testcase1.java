package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibo_B2C_Registration;
import launchquit.GoibiboLaunchQuit;

public class Goibibo_Reg_Testcase1 extends GoibiboLaunchQuit{
	@Test
	public void testcase() throws InterruptedException
	{
		Goibibo_B2C_Registration g=new Goibibo_B2C_Registration(driver);
		g.enter_mobile_number();
		//g.enter_mobile_number1();
		g.continue_mobile();
		/*g.login_success_message();
		g.Validate_login();
		g.invalid_otp();
		g.Validate_invalid_otp();*/
		
		
	
	
	

}
}
