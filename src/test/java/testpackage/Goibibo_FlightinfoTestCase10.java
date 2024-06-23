package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_FlightInfo;
import airplainApplication.Goibibo_B2C_MultiplePassengers;
import airplainApplication.Goibibo_B2C_Registration;
import launchquit.GoibiboLaunchQuit;

public class Goibibo_FlightinfoTestCase10 extends GoibiboLaunchQuit {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void flight_info_faredetails_baggage_link_verify() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Goibibo_B2C_Registration r1 = new Goibibo_B2C_Registration(driver);
		//r1.hoverover_sign_up();
		//Thread.sleep(2000);
//			
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
//		r1.enter_mobile_number();
//		r1.continue_mobile();
		
	//	Thread.sleep(6000);

		Goibibio_B2C_OnewayFlights s1=new Goibibio_B2C_OnewayFlights(driver);
		s1.F_city();
		s1.T_city();
		s1.date();
		Goibibo_B2C_MultiplePassengers m=new Goibibo_B2C_MultiplePassengers(driver);
		m.traveller_class1();
		Goibibo_B2C_FlightInfo f1=new Goibibo_B2C_FlightInfo(driver);
		f1.flight_detals();
		f1.flight_info();
		f1.validate_flight_info_link();
		f1.fare_details();
		f1.validate_fare_details();
		f1.baggage_details();
		f1.validate_baggage_details();
		f1.cancel_details();
		f1.validate_cancel_details();

}
}
