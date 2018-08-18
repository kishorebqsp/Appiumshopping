package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	@FindBy(linkText="Printed Summer Dress")
	private WebElement dress;
	

	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void selaectedDress()
	{
		dress.click();
	}

}
