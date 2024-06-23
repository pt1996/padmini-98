package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airplainApplication.Goibibo_B2C_Registration;
import airplainApplication.Goibibo_B2C_RoundTripFlights;
import launchquit.GoibiboLaunchQuit;
@Listeners(Listeners2.class)

public class TestCase14 extends GoibiboLaunchQuit {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void domestic_roundtrip_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Goibibo_B2C_Registration r1 = new Goibibo_B2C_Registration(driver);
	//	r1.hoverover_sign_up();
		//Thread.sleep(2000);
//			
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		//r1.enter_mobile_number();
		//r1.continue_mobile();
		
		Thread.sleep(6000);
		Goibibo_B2C_RoundTripFlights  s1=new Goibibo_B2C_RoundTripFlights (driver);
		//s1.one_way_Search();
		s1.roundtrip();
		Thread.sleep(3000);
		s1.F_city();
		s1.T_city();
		s1.date();
		s1.return_journey();
		s1.serach_flights();
		
	


}
}
