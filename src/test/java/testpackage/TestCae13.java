package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airplainApplication.Coupon_Apply;
import airplainApplication.Extra_Features_Flightpassenger;
import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_MultiplePassengers;
import airplainApplication.Goibibo_B2C_Registration;
import launchquit.GoibiboLaunchQuit;

public class TestCae13 extends GoibiboLaunchQuit {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Goibibo_B2C_Registration r1 = new Goibibo_B2C_Registration(driver);
		//r1.hoverover_sign_up();
		//Thread.sleep(2000);
//			
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
//	r1.enter_mobile_number();
//	r1.continue_mobile();
		
	//Thread.sleep(6000);

		
		Goibibio_B2C_OnewayFlights s1=new Goibibio_B2C_OnewayFlights(driver);
	//	s1.flight();
	//	s1.home_page();
	//	s1.home_page_pop();
//		s1.hotel();
//		s1.flight();
	//	s1.round_trip();
	//	Thread.sleep(2000);
	//	s1.one_way_Search();
		s1.F_city();
		s1.T_city();
		s1.date();
		Goibibo_B2C_MultiplePassengers m=new Goibibo_B2C_MultiplePassengers(driver);
		m.traveller_class1();
		
		Extra_Features_Flightpassenger e1=new Extra_Features_Flightpassenger(driver);
	//	e1.one_stop();
		e1.view_fares();
		e1.book_ticket(driver);
		
	
		
		Coupon_Apply c1=new Coupon_Apply(driver);
		//c1.switchwindow(driver);
		c1.view_all_coupon();
		c1.select_coupon();
		c1.validate_discount();

}
}
