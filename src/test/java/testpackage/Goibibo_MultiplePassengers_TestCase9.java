package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_MultiplePassengers;
import launchquit.GoibiboLaunchQuit;

public class Goibibo_MultiplePassengers_TestCase9 extends GoibiboLaunchQuit {
	@Test
	public void multipassenger_singlebooking() throws InterruptedException
	{
		Goibibio_B2C_OnewayFlights f=new  Goibibio_B2C_OnewayFlights(driver);
		 f.F_city();
		 f.T_city();
		 f.date();
		 Thread.sleep(3000);
		 Goibibo_B2C_MultiplePassengers p=new Goibibo_B2C_MultiplePassengers(driver);
		 p.traveller_class1();
		 f.serach_flights();
	}

}
