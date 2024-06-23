package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_MulticityFlightSearch;
import airplainApplication.Goibibo_B2C_RoundTripFlights;
import launchquit.GoibiboLaunchQuit;

public class Goibibo_Multicity_Testcase7  extends GoibiboLaunchQuit{
	@Test
	public void multicity() throws InterruptedException
	{
		Goibibo_B2C_RoundTripFlights r=new Goibibo_B2C_RoundTripFlights (driver);
		r.close_window();
		Goibibo_B2C_MulticityFlightSearch m=new Goibibo_B2C_MulticityFlightSearch(driver);
		m.multicity_trip();
		Goibibio_B2C_OnewayFlights f=new Goibibio_B2C_OnewayFlights (driver);
		f.F_city();
		 f.T_city();
		 f.date();
		 m.search();
		 f.serach_flights();
		
		
		
	}

}
