package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage
{
	public    FlipkartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//declaration
	@FindBy(xpath="//input[@class='_3704LK']")
    private WebElement SearchTextfield;
	
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement CartButton;
	
	@FindBy(xpath="//button[@type='submit']")
	 private WebElement SearchButton;
	
    public WebElement getSearchButton() 
    {
		return SearchButton;
	}

	//getters Method
	public WebElement getSearchTextfield()
	{
		return SearchTextfield;
	}

	public WebElement getCartButton()
	{
		return CartButton;
	}
	
	
	//business Logics
		/**
		 * @param ProductName
		 * @author vikas
		 */
		public void searchTextField(String ProductName) 
		{
			SearchTextfield.sendKeys(ProductName);
		}
		
		public void cartButton()
		{
			CartButton.click();
		}
	
        public void searchButton()
        {
        	SearchButton.click();
        }
	
	
	

}
