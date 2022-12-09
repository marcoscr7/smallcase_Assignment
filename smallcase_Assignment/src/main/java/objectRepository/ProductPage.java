package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage
{
	//Initialization
	public  ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//declaration
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	private WebElement ProductPrice;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement AddToCart;
	
	public WebElement getAddToCart()
	{
		return AddToCart;
	}

	//Getters Method
	public WebElement getProductPrice() 
	{
		return ProductPrice;
	}
	
	//business Logics
			/**
			 * @author vikas
			 */
	
	public void addToCart()
	{
		AddToCart.click();
	}
	
	

}
