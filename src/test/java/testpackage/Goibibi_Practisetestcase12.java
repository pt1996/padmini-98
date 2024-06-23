package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import airplainApplication.Goibibi_Practise;
import launchquit.GoibiboLaunchQuit;

public class Goibibi_Practisetestcase12 extends GoibiboLaunchQuit {
@Test
public void login_valid_credentials() throws EncryptedDocumentException, IOException, InterruptedException

{
	Goibibi_Practise r1 = new Goibibi_Practise(driver);
	r1.enter_mobile_number();
	r1.continue_mobile();
	r1.enter_otp();
	r1.Validate_login(); 
}
}
