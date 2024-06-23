package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibio_B2C_OnewayFlights;
import launchquit.GoibiboLaunchQuit;

public class Goibibi_OnewayTestCase4 extends  GoibiboLaunchQuit {
	@Test
	public void Testcase4() throws InterruptedException
	{
		 Goibibio_B2C_OnewayFlights f=new  Goibibio_B2C_OnewayFlights(driver);
		 f.F_city();
		 f.T_city();
		 f.date();
		 f.serach_flights();
		 
	}

}
