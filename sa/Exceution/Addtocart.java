package Exceution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Constant;
import Genericlib.Excel;
import POM.Cartpage;
import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;
import io.appium.java_client.android.AndroidDriver;

public class Addtocart extends Basetest {

	@Test
	public void cart(){
	
		String emailadd = Excel.excelsheet(path,"Sheet1",1, 0);
		String password = Excel.excelsheet(path,"Sheet1",1,1);
		String product = Excel.excelsheet(path,"Sheet1",1,2);
		
		
		Loginpage l=new Loginpage(driver);
l.signINButton();
l.emailAdddress(emailadd);
l.passwordtb(password);
l.loginbtn();
Homepage h=new Homepage(driver);
h.searchtxtbox(product);
h.searchbutton();
Dresspage dr=new Dresspage(driver);
dr.selaectedDress();
Cartpage c=new Cartpage(driver);
c.addTocart();
	}

}
