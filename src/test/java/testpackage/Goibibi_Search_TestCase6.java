package testpackage;

import org.testng.annotations.Test;

import airplainApplication.Goibibio_B2C_OnewayFlights;
import airplainApplication.Goibibo_B2C_ValidateSearchResult;
import launchquit.GoibiboLaunchQuit;

public class Goibibi_Search_TestCase6 extends GoibiboLaunchQuit {
	@Test
	public void search() throws InterruptedException
	{
		 Goibibio_B2C_OnewayFlights f=new  Goibibio_B2C_OnewayFlights(driver);
		 f.F_city();
		 f.T_city();
		 f.date();
		Goibibo_B2C_ValidateSearchResult v=new Goibibo_B2C_ValidateSearchResult(driver);
		v.traveller_class();
	    f.serach_flights();
	    Thread.sleep(5000);
	    /*//case 2:
	    driver.navigate().back();
	    
		 v.traveller_class();
		 v.business_class();
		   f.serach_flights();
		   Thread.sleep(5000);
		   
		   //case 3:
		   driver.navigate().back();
		   v.traveller_class();
		   v.first_class();
		   f.serach_flights();*/
		   
		 
		 
	    
		
	}

}
