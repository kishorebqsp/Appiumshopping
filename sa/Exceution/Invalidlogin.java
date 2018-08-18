package Exceution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Constant;
import Genericlib.Excel;
import POM.Loginpage;
import io.appium.java_client.android.AndroidDriver;

public class Invalidlogin extends Basetest{

	@Test
	public void invalidloginn(){
		
		
		String emailadd = Excel.excelsheet(path,"Sheet3",1, 0);
		String password = Excel.excelsheet(path,"Sheet3",1,1);
		
		Loginpage l=new Loginpage(driver);
l.signINButton();
l.emailAdddress(emailadd);
l.passwordtb(password);
l.loginbtn();
	

	}

}
