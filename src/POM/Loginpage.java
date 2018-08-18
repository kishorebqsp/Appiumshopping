package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(linkText="Sign in")
	private WebElement sign;
	
	@FindBy(id="email")
	private WebElement email;
	
@FindBy(id="passwd")
private WebElement pass;

@FindBy(id="SubmitLogin")
private WebElement signin;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void signINButton()
{
	sign.click();
}
public void emailAdddress(String emailadd) {
	email.sendKeys(emailadd);
}
public void passwordtb(String password)
{
	pass.sendKeys(password);
}
public void loginbtn()
{
	signin.click();
}
}
