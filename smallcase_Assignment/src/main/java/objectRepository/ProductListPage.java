package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage 
{
	//Initialization
		public  ProductListPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//declaration
		@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
		private WebElement ProductLink;
		
		

		//Getters Method
		public WebElement getProductLink() 
		{
			return ProductLink;
		}
		
		//business Logics
		/**
		 * @author vikas
		 */
		public void productLink()
		{
			ProductLink.click();
		}
		
		
}
