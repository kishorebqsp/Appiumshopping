package Exceution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Constant;
import Genericlib.Excel;
import POM.Homepage;
import POM.Loginpage;
import POM.Wishlistpage;
import io.appium.java_client.android.AndroidDriver;

public class Mywishlist extends Basetest {

	@Test
	public void wish(){
	
		
		String emailadd = Excel.excelsheet(path,"Sheet1",1, 0);
		String password = Excel.excelsheet(path,"Sheet1",1,1);
		String namee = Excel.excelsheet(path,"Sheet2",1,0);
	
		Loginpage l=new Loginpage(driver);
l.signINButton();
l.emailAdddress(emailadd);
l.passwordtb(password);
l.loginbtn();
Homepage h=new Homepage(driver);
h.wishlist();
Wishlistpage w=new Wishlistpage(driver);
w.nametxtbox(namee);
w.savebtn();
w.signoutbtn();

	}

}
