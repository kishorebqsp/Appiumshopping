package Genericlib;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class Basetest implements Constant {
	public AndroidDriver driver;

	@BeforeMethod()
	public void openapp() throws MalformedURLException
	{DesiredCapabilities d=new DesiredCapabilities();
	d.setCapability("platformVersion",platformVersion);
	d.setCapability("deviceName",deviceName); 
	d.setCapability("browserName","chrome");
	URL u=new URL(url);
	 driver=new AndroidDriver(u,d);
	 String ul = Excel.excelsheet(path,"Sheet1",1, 3);
	 driver.get(ul);

}
	@AfterMethod()
	public void closeapp(ITestResult result)
	{
		String name = result.getName();
		int status = result.getStatus();
		if(status==2)
		{
			Photo.getphoto(driver,photopath,name);
		}
		driver.closeApp();
	}
}