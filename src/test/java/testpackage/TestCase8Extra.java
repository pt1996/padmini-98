package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import airplainApplication.Extra_Features_Flightpassenger;
import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_MultiplePassengers;
import airplainApplication.Goibibo_B2C_Registration;
import airplainApplication.Personal_Details;
import launchquit.GoibiboLaunchQuit;

public class TestCase8Extra extends GoibiboLaunchQuit{
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	//@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Goibibo_B2C_Registration r1 = new Goibibo_B2C_Registration(driver);
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
		//	r1.enter_mobile_number();
		//	r1.continue_mobile();
		
		Goibibio_B2C_OnewayFlights s1=new Goibibio_B2C_OnewayFlights(driver);
	//	s1.flight();
	//	s1.home_page();
	//	s1.home_page_pop();
	//	s1.hotel();
	//	Thread.sleep(2000);
	//	s1.flight();
	//	s1.round_trip();
	//	Thread.sleep(2000);
	//	s1.one_way_Search();
		s1.F_city();
		s1.T_city();
		s1.date();
		Goibibo_B2C_MultiplePassengers m=new Goibibo_B2C_MultiplePassengers(driver);
		m.traveller_class1();
		s1.serach_flights();
		
		
	
		Extra_Features_Flightpassenger e1=new Extra_Features_Flightpassenger(driver);
		e1.one_stop();
		e1.view_fares();
		Thread.sleep(3000);
	//	e1.paid_seat();
		e1.chargable_meal();
		e1.check_in_baggage();
		e1.validate_chargable_meal();
		e1.validate_check_in_baggage();
		e1.book_ticket(driver);
		
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
		p1.proceed_with_booking();
		e1.proceed(driver);
		e1.thats_correct();
		e1.extra_legroom_charge();
		e1.validate_extra_legroom_charge();
		
		

//		Logout l1=new Logout(driver);
//		l1.hover_profile_name();
//		l1.view_your_profile();
//		l1.logout();
//		l1.confirm_logout();

}
}
