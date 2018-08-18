package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
	@FindBy(id="name")
	private WebElement nametb;
	@FindBy(id="submitWishlist")
	private WebElement savetb;
	@FindBy(linkText="Sign out")
	private WebElement signout;

	public Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void nametxtbox(String nameofp)
	{
		nametb.sendKeys(nameofp);	
	}
	public void savebtn()
	{
		savetb.click();	
	}
	public void signoutbtn()
	{
		signout.click();	
	}

}
