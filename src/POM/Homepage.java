package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="search_query_top")
	private WebElement search;
	
	@FindBy(name="submit_search")
	private WebElement searchbtn;
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement wish;
	

	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void searchtxtbox(String product)
	{
		search.sendKeys(product);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	
	public void wishlist()
	{
		wish.click();
	}
}
