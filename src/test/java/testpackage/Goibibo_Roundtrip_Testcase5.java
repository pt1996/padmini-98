package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibo_B2C_RoundTripFlights;
import launchquit.GoibiboLaunchQuit;

public class Goibibo_Roundtrip_Testcase5 extends GoibiboLaunchQuit {
	@Test
	public void roundtrip() throws InterruptedException
	{
		Goibibo_B2C_RoundTripFlights r=new Goibibo_B2C_RoundTripFlights(driver);
		r.close_window();
		r.roundtrip();
		r.F_city();
		r.T_city();
		r.date();
		r.return_journey();
		r.serach_flights();
		
	}

}
