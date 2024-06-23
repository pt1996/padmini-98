package testpackage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airplainApplication.Extra_Features_Flightpassenger;
import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_MultiplePassengers;
import airplainApplication.Goibibo_B2C_Registration;
import airplainApplication.Personal_Details;
import launchquit.GoibiboLaunchQuit;

public class TestCase15 extends GoibiboLaunchQuit {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException, AWTException

	
	{
		Goibibo_B2C_Registration r1 = new Goibibo_B2C_Registration(driver);
		r1.pop_up_window();
		r1.Close_the_Mobile_window();

//		r1.enter_mobile_number();
//		r1.continue_mobile();
//		r1.enter_otp();

		Goibibio_B2C_OnewayFlights s1 = new Goibibio_B2C_OnewayFlights(driver);
		s1.F_city();
		s1.T_city();
		s1.date();
		Goibibo_B2C_MultiplePassengers m=new Goibibo_B2C_MultiplePassengers(driver);
		m.traveller_class1();
		s1.serach_flights();
		Extra_Features_Flightpassenger e1=new Extra_Features_Flightpassenger(driver);
		e1.view_fares();
		e1.book_ticket(driver);
	//	Thread.sleep(3000);
	

		
		Personal_Details p1=new Personal_Details(driver);
		p1.billing_address();
		p1.pincode();
	
		p1.billing_info_save();
		p1.gender();
		p1.first_name();
		p1.last_name();
		p1.email_id();
		p1.mobile_number();
		e1.travel_unsecured();
		e1.proceed(driver);
		e1.thats_correct();

}
}
